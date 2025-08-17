class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int maxRank=Integer.MIN_VALUE;
        // lets convert it into first adj list 
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int road[]:roads){
            int u=road[0];
            int v=road[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int ranki=adj.get(i).size();
                int rankj=adj.get(j).size();
                int totalRank=ranki+rankj;
                // what if extra get calculated
                if(adj.get(i).contains(j)){
                    // reduced by 1
                    totalRank-=1;
                }
                maxRank=Math.max(maxRank,totalRank);
            }
        }
        return maxRank;
    }
}
