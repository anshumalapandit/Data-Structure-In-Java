import java.util.*;

class Solution {
    public static double dfs(String src, String dest, double acc, Map<String, Map<String, Double>> adj, HashSet<String> vis) {
        if (src.equals(dest)) {
            return acc;
        }
        vis.add(src);

        for (Map.Entry<String, Double> nbr : adj.get(src).entrySet()) {
            String nxt = nbr.getKey();
            double val = nbr.getValue();
            if (!vis.contains(nxt)) {
                double result = dfs(nxt, dest, acc * val, adj, vis);
                if (result != -1.0) {
                    return result;
                }
            }
        }
        return -1.0;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        // Make an adjacency list storing u/v = value and v/u = 1/value
        Map<String, Map<String, Double>> adj = new HashMap<>();

        int n = values.length;
        for (int i = 0; i < n; i++) {
            List<String> exp = equations.get(i);
            String u = exp.get(0);
            String v = exp.get(1);
            double value = values[i];

            adj.putIfAbsent(u, new HashMap<>());
            adj.putIfAbsent(v, new HashMap<>());
            adj.get(u).put(v, value);
            adj.get(v).put(u, 1.0 / value);
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);

            if (!adj.containsKey(src) || !adj.containsKey(dest)) {
                result[i] = -1.0;
            } else if (src.equals(dest)) {
                result[i] = 1.0;
            } else {
                HashSet<String> vis = new HashSet<>();
                result[i] = dfs(src, dest, 1.0, adj, vis);
            }
        }
        return result;
    }
}
