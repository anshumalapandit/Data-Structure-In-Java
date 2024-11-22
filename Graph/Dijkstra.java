package ADS;
import java.util.*;

public class Assign8 {
    
    // Edge class to represent an edge with source, destination, and weight
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

    // Pair class used in the PriorityQueue for Dijkstra's algorithm
    public static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // Sorting based on the path (weight)
        }
    }

    // Your approach for Dijkstra's algorithm (with slight modification for clarity)
    public static void dks(ArrayList<Edge>[] graph, int src) {
        int dis[] = new int[graph.length];

        // Initialize all distances to infinity except the source
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;  // Setting other nodes to infinity
            } 
        }

        boolean vis[] = new boolean[graph.length];  // Visited array
        PriorityQueue<Pair> pq = new PriorityQueue<>();  // Min-heap for Dijkstra's algorithm
        pq.add(new Pair(src, 0));  // Starting from source with distance 0

        // Dijkstra's algorithm loop
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();  // Get the node with the smallest distance

            if (!vis[curr.n]) {  // If the node has not been visited
                vis[curr.n] = true;  // Mark the node as visited

                // Explore all the neighbors of the current node
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;  // Source vertex
                    int v = e.dest; // Destination vertex
                    int wt = e.wt;  // Weight of the edge

                    // Relax the edge (if a shorter path is found)
                    if (dis[u] + wt < dis[v]) {
                        dis[v] = dis[u] + wt;  // Update the distance
                        pq.add(new Pair(v, dis[v]));  // Add the updated vertex to the priority queue
                    }
                }
            }
        }

        // Display the shortest path from source to all other vertices
        System.out.println("Shortest paths from source vertex " + src + ":");
        for (int i = 0; i < dis.length; i++) {
            System.out.println("To vertex " + i + " -> " + (dis[i] == Integer.MAX_VALUE ? "Unreachable" : dis[i]));
        }
    }

    // Main function where input is taken
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();

        // Initialize the graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Input number of edges
        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();

        // Input edges and their weights
        System.out.println("Enter the edges in the format: src dest weight");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();

            // Add the undirected edge to both the source and destination
            graph[src].add(new Edge(src, dest, wt));
            graph[dest].add(new Edge(dest, src, wt));
        }

        // Input source vertex
        System.out.println("Enter the source vertex:");
        int src = sc.nextInt();
       System.out.println("Using Dijkstra Algorithm: ");
        // Call Dijkstra's algorithm using your approach
        dks(graph, src);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}

