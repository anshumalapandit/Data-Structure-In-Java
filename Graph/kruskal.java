package ADS;
import java.util.*;

public class Assign7 {
    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt; // Sort by weight in ascending order
        }
    }

    public static int n; // Number of vertices
    public static int[] par; // Parent array for Union-Find
    public static int[] rank; // Rank array for Union-Find

    // Initialize the parent and rank arrays
    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i; // Initially, each vertex is its own parent
            rank[i] = 0; // Rank is initially 0
        }
    }

    // Find the parent of a vertex using path compression
    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]); // Path compression
    }

    // Union operation by rank
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    // Kruskal's algorithm to find MST and its cost
    public static void Kmst(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges); // Sort edges by weight (O(E log E))
        int mstCost = 0;
        int count = 0;

        // Process edges and build MST
        for (int i = 0; count < V - 1; i++) { // O(V)
            Edge e = edges.get(i);
            int parA = find(e.src); // Find the root of src
            int parB = find(e.dest); // Find the root of dest
            if (parA != parB) { // If they are in different sets, include this edge
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println("Minimum Spanning Tree Cost: " + mstCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of vertices and edges
        System.out.print("Enter the number of vertices: ");
        n = scanner.nextInt();
        par = new int[n];
        rank = new int[n];

        System.out.print("Enter the number of edges: ");
        int edgeCount = scanner.nextInt();

        ArrayList<Edge> edges = new ArrayList<>();

        // Input edges (src, dest, weight)
        System.out.println("Enter the edges (src, dest, wt):");
        for (int i = 0; i < edgeCount; i++) {
      
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            int wt = scanner.nextInt();
            edges.add(new Edge(src, dest, wt));
        }
   System.out.println("Using Kruskal Algorithm : ");
        // Run Kruskal's algorithm to find MST
        Kmst(edges, n);

        scanner.close();
    }
}

