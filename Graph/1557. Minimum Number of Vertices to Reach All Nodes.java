class Solution {
    public void dfs(int node, int[] vis, List<List<Integer>> adj) {
        vis[node] = 1;
        for (int nbr : adj.get(node)) {
            if (vis[nbr] == 0) {
                dfs(nbr, vis, adj);
            }
        }
    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];  // Track incoming edges

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph + indegree array
        for (List<Integer> edge : edges) {
            int src = edge.get(0);
            int dest = edge.get(1);
            adj.get(src).add(dest);
            indegree[dest]++;  // count incoming edge for dest
        }

        int[] vis = new int[n];
        List<Integer> ans = new ArrayList<>();

        // DFS from nodes with no incoming edges
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0 && vis[i] == 0) { // source nodes only
                ans.add(i);
                dfs(i, vis, adj);
            }
        }

        return ans;
    }
}
