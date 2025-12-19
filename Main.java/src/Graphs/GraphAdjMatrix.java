package Graphs;
import java.util.*;

// We need a 2D array, say int[][] matrix. The size will be V x V, where V is the number of vertices.
//matrix[i][j] = 1 will mean an edge exists from i to j. 0 means no edge.
//Adding an edge is a simple assignment: matrix[source][dest] = 1. For an undirected graph, we also set matrix[dest][source] = 1.

public class GraphAdjMatrix {

    public static enum GraphType {
        DIRECTED,
        UNDIRECTED
    }

    private final int[][] adjMatrix;
    private final int numVertices;
    private final GraphType graphType;

    public GraphAdjMatrix(int numVertices,GraphType type){
        this.numVertices=numVertices;
        this.graphType = type;
        adjMatrix=new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination){
         if(source>=0 && source<numVertices && destination>=0 && destination<numVertices){
             adjMatrix[source][destination]=1;
             if (graphType == GraphType.UNDIRECTED) {
                 adjMatrix[destination][source] = 1;
             }
         }
    }

    public void printAdjMatrix(){
       for(int i=0;i<numVertices;i++){
           System.out.println(Arrays.toString(adjMatrix[i]));
       }
    }

    public static void main(String[] args) {
        int V = 5;
        System.out.println("--- Building an UNDIRECTED Adjacency Matrix ---");
        GraphAdjMatrix graph = new GraphAdjMatrix(V, GraphType.UNDIRECTED);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjMatrix();
    }
}
