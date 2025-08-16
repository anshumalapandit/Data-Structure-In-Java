class Solution {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    Map<Integer, Integer> bobMap = new HashMap<>();
    int aliceIncome;

    public boolean DFSBob(int curr, int t, boolean[] visited) {
        visited[curr] = true;
        bobMap.put(curr, t);

        if (curr == 0) { // reached target
            return true;
        }

        for (int ngbr : adj.getOrDefault(curr, new ArrayList<>())) {
            if (!visited[ngbr]) {
                if (DFSBob(ngbr, t + 1, visited)) {
                    return true;
                }
            }
        }

        bobMap.remove(curr); // if nhi mila 0 kahi pe so remove it from path
        return false; // not found zero in this path
    }

   public  void DFSAlice(int curr, int t, int income, boolean[] visited, int[] amount) {
        visited[curr] = true;
        
        // first check kya bob iss node pe pahucha tha kya kabhi .. if nhi to alice have to pay
        // if nhi bob pahuch ya alice pehle pahuch gya usse to he have to pay all cost alone 
        if (!bobMap.containsKey(curr) || t < bobMap.get(curr)) {
            income += amount[curr];
        } else if (t == bobMap.get(curr)) {
            // if both reaches at same time then cost will split between two
            income += (amount[curr] / 2);
        }
        // agar leaf node pe pahuch gyi hai to ..calculate income
        // how can i know that it is leaf node ? if adj list mai uss node k cores ek hi node ho.
        if (adj.getOrDefault(curr, new ArrayList<>()).size() == 1 && curr != 0) { // leaf node 
        // should not = to src node i.e 0
        // cur income is alreday we calculated previous state 
        // just update it
            aliceIncome = Math.max(aliceIncome, income);
        }

        /*
            {1} -> (2, 3)
            2 -> 1
            3 -> 1,....
            (1) ---- (2)
             |
             |
             (3)------.....
        */

        for (int ngbr : adj.getOrDefault(curr, new ArrayList<>())) {
            if (!visited[ngbr]) {
                DFSAlice(ngbr, t + 1, income, visited, amount);
            }
        }
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length; // n nodes (0 to n-1)
        aliceIncome = Integer.MIN_VALUE; // bcoz we have to find maximum profit

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        // DFS on Bob for finding time to reach each node till 0
        int time = 0;
        boolean[] visited = new boolean[n];
        DFSBob(bob, time, visited);

        int income = 0; // curIncome
        Arrays.fill(visited, false);
        DFSAlice(0, 0, income, visited, amount);

        return aliceIncome;
    }
}
