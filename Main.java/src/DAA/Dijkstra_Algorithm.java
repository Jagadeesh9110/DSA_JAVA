package DAA;

import java.util.*;

public class Dijkstra_Algorithm {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        HashMap<Integer,List<int[]>> graph=new HashMap<>();
        System.out.println("Enter the number of the node : ");
         int nodes=in.nextInt();
        System.out.println("Enter the number of the edges : ");
        int edges=in.nextInt();
        for(int i=0;i<edges;i++){
            System.out.println("Enter the source node, destination node and edge weight: ");
             int source=in.nextInt();
             int dest=in.nextInt();
             int weight=in.nextInt();
            if (!graph.containsKey(source)) {
                graph.put(source, new ArrayList<>());
            }

            graph.get(source).add(new int[]{dest, weight});
        }

        System.out.println("Enter the starting node for Dijkstra's algorithm: ");
        int startNode = in.nextInt();
        dijkstra(graph, startNode, nodes);

    }
    public static void dijkstra(HashMap<Integer, List<int[]>> graph, int startNode, int totalNodes) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] dist=new int[totalNodes];
        for(int i=0;i<totalNodes;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[startNode]=0;

        pq.add(new int[]{startNode,0});

        while(!pq.isEmpty()){
            int[] curArr=pq.poll();
            int u=curArr[0],curDist=curArr[1];
            if(curDist>dist[u]){
                continue;
            }

            if(graph.containsKey(u)){
                for(int[] neighbor: graph.get(u)){
                    int v=neighbor[0], weight=neighbor[1];
                    if(dist[u]+weight<dist[v]){
                        dist[v]=dist[u]+weight;
                        pq.add(new int[]{v,dist[v]});
                    }
                }
            }
        }

        System.out.println(" Shortest distance from the starting node  "+startNode+" to ");
        for(int i=0;i<totalNodes;i++){
            System.out.println(" Node "+i+" : "+ (dist[i]==Integer.MAX_VALUE? " infinity ":dist[i]));
        }

    }
}
