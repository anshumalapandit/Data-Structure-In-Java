package ADS;
import java.util.*;

public class Assign6 {
    
    // Edge class represents an edge with source, destination, and weight
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Pair class to represent a vertex and the cost for Prim's algorithm
    public static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // To sort the pairs by the cost in ascending order
        }
    }

    // Function to create a graph with the given number of vertices and edges
    public static void createGraph(ArrayList<Edge>[] graph) {
        // No input needed here anymore as input is taken in main
    }

    // Prim's algorithm to find the Minimum Spanning Tree (MST)
    public static void prim(ArrayList<Edge> graph[]) {
        boolean[] vis = new boolean[graph.length];  // Visited array to keep track of visited nodes
        PriorityQueue<Pair> pq = new PriorityQueue<>();  // Priority queue to pick the minimum weight edge
        pq.add(new Pair(0, 0));  // Start from vertex 0 with cost 0
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.v]) {  // If the current vertex is not visited
                vis[curr.v] = true;  // Mark the current vertex as visited
                finalCost += curr.cost;  // Add the cost of the current edge to the final cost

                // Add all the neighbors of the current vertex to the priority queue
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    if (!vis[e.dest]) {  // Add only unvisited neighbors
                        pq.add(new Pair(e.dest, e.wt));  // Add the neighbor and its edge weight
                    }
                }
            }
        }
        System.out.println("Minimum Final Cost of MST is: " + finalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();

        // Initialize the graph with V vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Input number of edges
        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();

        // Input edges and their weights
        System.out.println("Enter the edges (src, dest, wt):");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();

            // Add the undirected edge to both the source and destination
            graph[src].add(new Edge(src, dest, wt));
            graph[dest].add(new Edge(dest, src, wt));
        }
         System.out.println("Using Prims algotihm: ");
        // Run Prim's algorithm to find MST and print the minimum cost
        prim(graph);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}

