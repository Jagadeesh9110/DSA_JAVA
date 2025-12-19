package Graphs;

import java.util.*;

public class WeightedGraph<T> {
    private static class Edge<T> implements Comparable<Edge<T>>{
        T destination;
        int weight;
        public Edge(T destination,int weight) {
            this.destination = destination;
            this.weight = weight;
        }
            @Override
            public int compareTo(Edge<T> other) {
                return Integer.compare(this.weight, other.weight);
            }

            @Override
            public String toString() {
                return "(" + destination + ", " + weight + ")";
            }
    }

    private static class FullEdge<T> implements Comparable<FullEdge<T>> {
        T source;
        T destination;
        int weight;

        FullEdge(T source, T destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(FullEdge<T> other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
    private static class UnionFind<T> {
        private Map<T,T> parent=new HashMap<>();
        private Map<T,Integer> rank=new HashMap<>();

        public void makeSet(T i){
            parent.put(i,i); // An element is its own parent initially
            rank.put(i,0);   // The rank (or height) of the tree is 0
        }

        // Find the representative of the set containing i (with path compression)
        public T find(T i){
            if(parent.get(i).equals(i)){
                return i;
            }

            // Path Compression: Set the parent directly to the root
            T root = find(parent.get(i));
            parent.put(i, root);
            return root;
        }

        public  void union(T i, T j){
            T rootI=find(i);
            T rootJ=find(j);

            if(!rootI.equals(rootJ)){
                // Union by Rank: Attach the smaller tree to the root of the larger tree
                if(rank.get(rootI)<rank.get(rootJ)){
                    parent.put(rootJ,rootI);
                }else if(rank.get(rootI)>rank.get(rootJ)){
                  parent.put(rootI,rootJ);
                } else {
                parent.put(rootJ, rootI);
                rank.put(rootI, rank.get(rootI) + 1);
               }
            }
        }
    }
    private final Map<T, List<Edge<T>>> adjList;

    public WeightedGraph() {
        this.adjList = new HashMap<>();
    }
    public void addVertex(T vertex){
        adjList.putIfAbsent(vertex,new ArrayList<>());
    }

    public void addEdge(T source, T destination ,int weight){
        addVertex(source);
        addVertex(destination);

        adjList.get(source).add(new Edge<>(destination,weight));
        adjList.get(destination).add(new Edge<>(source,weight));
    }

    // Finds the Minimum Spanning Tree (MST) using Prim's algorithm.
    public void PrimsMST(T startNode){
        if(!adjList.containsKey(startNode)){
            System.out.println("Start node is not present in the graph");
            return;
        }
        PriorityQueue<Edge<T>> pq=new PriorityQueue<>();
        Set<T> visited=new HashSet<>();

        // mstEdges will store the final edges of our MST
        List<Map.Entry<T, Edge<T>>> mstEdges = new ArrayList<>();
        int totalCost = 0;

        visited.add(startNode);
        for(Edge<T> edge:adjList.getOrDefault(startNode,Collections.emptyList())){
            pq.add(edge);
        }

        // Loop until the MST is complete (V-1 edges) or no more edges are available

        while(!pq.isEmpty() && mstEdges.size() < adjList.size() - 1){
            Edge<T> minEdge=pq.poll();
            T destination=minEdge.destination;

            if(visited.contains(destination)){
                continue;
            }
            visited.add(destination);
            totalCost+=minEdge.weight;

            // We need to find the source of this edge to print it...
            for(T source:adjList.keySet()){
                for(Edge<T> e:adjList.get(source)){
                    if(e.destination.equals(destination) && e.weight==minEdge.weight && visited.contains(source)){
                        mstEdges.add(Map.entry(source,minEdge));
                        break;
                    }
                }
                if(mstEdges.size() > 0 && mstEdges.get(mstEdges.size()-1).getValue() == minEdge) break;
            }
            //  Add all of the new vertex's outgoing edges to the priority queue
            for(Edge<T> neighborEdge:adjList.getOrDefault(destination,Collections.emptyList())){
                if(!visited.contains(neighborEdge.destination)){
                    pq.add(neighborEdge);
                }
            }
        }


        System.out.println("------- Prim's MST------");
        for(Map.Entry<T,Edge<T>> entry:mstEdges){
            System.out.println("Edge: "+entry.getKey()+" - "+entry.getValue().destination + " | Weight: " + entry.getValue().weight);
        }
        System.out.println("Total MST Cost: " + totalCost);
    }

    public void kruskalsMST(){
        List<FullEdge<T>> allEdges = new ArrayList<>();
        for(T source:adjList.keySet()){
            for(Edge<T> edge:adjList.get(source)){
                // To avoid duplicates in an undirected graph, only add one representation
                // This simple check works for types that have a natural order (like String, Integer)
                if (source.hashCode() < edge.destination.hashCode()) {
                    allEdges.add(new FullEdge<>(source, edge.destination, edge.weight));
                }
            }
        }

        Collections.sort(allEdges);// sort all the edges by weights

        UnionFind<T> uf = new UnionFind<>();
        for (T vertex : adjList.keySet()) {
            uf.makeSet(vertex);
        }
        List<FullEdge<T>> mstEdges=new ArrayList<>();
        int totalCost=0;

        for(FullEdge<T> edge:allEdges){
            if(mstEdges.size()==adjList.size()-1){
                break;
            }

            T rootSource = uf.find(edge.source);
            T rootDest = uf.find(edge.destination);

            if(!rootSource.equals(rootDest)){
                // no cycle
                mstEdges.add(edge);
                totalCost += edge.weight;
                uf.union(edge.source, edge.destination);
            }
        }
        System.out.println("--- Kruskal's MST Result ---");
        for (FullEdge<T> edge : mstEdges) {
            System.out.println("Edge: " + edge.source + " - " + edge.destination + " | Weight: " + edge.weight);
        }
        System.out.println("Total MST Cost: " + totalCost);
    }

    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "D", 1);
        graph.addEdge("B", "C", 5);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 2);
        graph.addEdge("C", "E", 6);
        graph.addEdge("C", "F", 4);
        graph.addEdge("D", "E", 5);
        graph.addEdge("E", "F", 2);

        graph.PrimsMST("A");

        System.out.println();

        graph.kruskalsMST();
    }
}
