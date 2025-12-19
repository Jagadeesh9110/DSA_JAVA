package Graphs;

import java.util.*;


// We need a way to map a vertex to its neighbors. A Map<Integer, List<Integer>> is perfect for this.
// The key is the vertex, and the value is the list of its neighbors.
//The graph should support adding vertices and edges.
//For an undirected graph, if we add an edge from A to B, we must also add an edge from B to A.
public class GraphAdjList<T> {

    public static enum GraphType {
        DIRECTED,
        UNDIRECTED
    }
    private Map<T,List<T>> adjList;
    private final GraphType graphType;

    public GraphAdjList(GraphType type){
         this.adjList=new HashMap<>();
        this.graphType = type;
    }

    public void addVertex(T vertex){
         adjList.putIfAbsent(vertex,new ArrayList<>());
    }
    // Adds an edge between two vertices (for an undirected graph)
    public void addEdge(T source,T destination){
         addVertex(source);
         addVertex(destination);

         adjList.get(source).add(destination);
        if (this.graphType == GraphType.UNDIRECTED) {
            adjList.get(destination).add(source);
        }
    }

    public void printAdjList(){
        for(T vertex:adjList.keySet()){
            System.out.print("Vertex: "+vertex+" --> ");
            System.out.println(adjList.get(vertex));
        }
    }

    public void bfs(T startNode){
        System.out.println("BFS Starting from "+startNode+": ");
        Queue<T> queue=new LinkedList<>();
        Set<T> visited=new HashSet<>();// // To avoid cycles and redundant processing

        queue.add(startNode);
        visited.add(startNode);

        while(!queue.isEmpty()){
             T cur=queue.poll();
            System.out.println(cur+" ");
            for(T neighbor : adjList.getOrDefault(cur, Collections.emptyList())){
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfsRecursive(T startNode) {
        System.out.print("DFS (Recursive) starting from " + startNode + ": ");
        Set<T> visited = new HashSet<>();
        dfsRecursiveHelper(startNode, visited);
        System.out.println();
    }

    private void dfsRecursiveHelper(T cur, Set<T> visited) {
        visited.add(cur);
        System.out.println(cur+ " ");
        for(T neighbor : adjList.getOrDefault(cur, Collections.emptyList())){
           if(!visited.contains(neighbor)){
               dfsRecursiveHelper(neighbor,visited);
           }
        }
    }


    public void dfsIterative(T startNode){
        System.out.print("DFS (Iterative) starting from " + startNode + ": ");
        Stack<T> stack = new Stack<>();
        Set<T> visited = new HashSet<>();

        stack.push(startNode);
        while(!stack.isEmpty()){
              T cur=stack.pop();
              if(!visited.contains(cur)){
                  visited.add(cur);
                  System.out.println(cur+ " ");
                  List<T> neighbors = adjList.getOrDefault(cur, Collections.emptyList());
                  for(int i=neighbors.size()-1;i>=0;i--){
                      T neighbor = neighbors.get(i);
                      if(!visited.contains(neighbor)){
                          stack.push(neighbor);
                      }
                  }
              }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter graph type (1 for DIRECTED, 2 for UNDIRECTED): ");
        int choice = in.nextInt();
        GraphType graphType = (choice == 1) ? GraphType.DIRECTED : GraphType.UNDIRECTED;
        GraphAdjList<Integer> graph = new GraphAdjList<>(graphType);
        System.out.println("Building a " + graphType + " graph.");
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);

        System.out.print("Enter the number of edges you want to add: ");
        int numEdges = in.nextInt();
        in.nextLine();

        System.out.println("Enter each edge on a new line (e.g., '0 1'):");
        for (int i = 0; i < numEdges; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            String[] edgeParts = in.nextLine().split(" ");

            if (edgeParts.length == 2) {
                try {
                    // Convert the String parts to Integers before adding them
                    int source = Integer.parseInt(edgeParts[0]);
                    int destination = Integer.parseInt(edgeParts[1]);
                    graph.addEdge(source, destination);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                    i--;
                }
            } else {
                System.out.println("Invalid input. Please enter two vertices separated by a space.");
                i--;
            }
        }

        System.out.println("\n--- Adjacency list implementation ---");
        graph.printAdjList();
        System.out.println("---------------------------------");

        System.out.println("Traversal Demonstrations:");
        if (!graph.adjList.isEmpty()) {
            System.out.print("Enter a starting node for traversal: ");
            int startNode = in.nextInt();

            graph.bfs(startNode);
            graph.dfsRecursive(startNode);
            graph.dfsIterative(startNode);
        } else {
            System.out.println("Graph is empty, skipping traversal.");
        }

//        System.out.println("Adjacency list implementation: ");
//
//        graph.printAdjList();
//
//        System.out.println("---------------------------------");
//
//        System.out.println("Traversal Demonstrations:");
//
//        graph.bfs(0);
//        graph.dfsRecursive(0);
//        graph.dfsIterative(0);

    }
}
