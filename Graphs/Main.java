import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
 
public class Main {
    static class Graph {
        int V;
        ArrayList<ArrayList<Node>> adj;
 
        // Inner class to represent an edge (destination and weight)
        static class Node {
            int dest;
            int weight;
 
            Node(int dest, int weight) {
                this.dest = dest;
                this.weight = weight;
            }
        }
 
        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }
 
        // Function to add an undirected edge between two vertices with given weight
        void addEdge(int src, int dest, int weight) {
            adj.get(src).add(new Node(dest, weight));
            adj.get(dest).add(new Node(src, weight));
        }
 static int cost = 0;
        // Function to find the Minimum Spanning Tree using Prim's algorithm
        void primMST() {
            int[] parent = new int[V];
            int[] key = new int[V];
            boolean[] inMST = new boolean[V];
 
            for (int i = 0; i < V; i++) {
                parent[i] = -1;          // Array to store the parent node of each vertex in the MST
                key[i] = Integer.MAX_VALUE;  // Array to store the minimum key value for each vertex
                inMST[i] = false;        // Array to track if the vertex is in the MST or not
            }
 
            PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
 
            key[0] = 0;                     // Start the MST from vertex 0
            minHeap.add(new Node(0, key[0]));
 
            while (!minHeap.isEmpty()) {
                Node u = minHeap.poll();    // Extract the node with the minimum key value
                int uVertex = u.dest;
                cost+=u.weight;
                inMST[uVertex] = true;
 
                // Traverse through all adjacent vertices of u (the extracted vertex) and update their key values
                for (Node v : adj.get(uVertex)) {
                    int vVertex = v.dest;
                    int weight = v.weight;
 
                    // If v is not yet included in MST and weight of u-v is less than key value of v, then update key value and parent of v
                    if (!inMST[vVertex] && weight < key[vVertex]) {
                        parent[vVertex] = uVertex;
                        key[vVertex] = weight;
                        minHeap.add(new Node(vVertex, key[vVertex]));
                    }
                }
            }

            printMST(parent);
        }
 
        // Function to print the edges of the Minimum Spanning Tree
        void printMST(int[] parent) {
            System.out.println("Edges of Minimum Spanning Tree:");
            for (int i = 1; i < V; i++) {
                System.out.println(parent[i] + " - " + i);
            }
        }
    }
 
    public static void main(String[] args) {
        int V = 9;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 8, 2);
        graph.addEdge(2, 5, 4);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);
 
        graph.primMST();
    }
}