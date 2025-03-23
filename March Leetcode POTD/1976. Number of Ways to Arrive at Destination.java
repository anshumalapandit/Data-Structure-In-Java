class Solution {
    private static final int MOD =1000000007;
    public int countPaths(int n, int[][] roads) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] road:roads){
            int u=road[0];
            int v=road[1];
            int time=road[2];
            adj.get(u).add(v);
            adj.get(v).add(u);
            adj.get(u).add(time);
            adj.get(v).add(time);
        }
        PriorityQueue<long []> pq=new PriorityQueue<>(Comparator.comparingLong(a->a[0]));
        long [] result=new long[n];
        int pathCount[]=new int[n];
        Arrays.fill(result,Long.MAX_VALUE);
        result[0]=0; // src se src tak ka diatance 0 hota hai na
        pathCount[0]=1;
        pq.offer(new long[]{0,0});
        while(!pq.isEmpty()){
            long [] cur=pq.poll();
            long curTime=cur[0];
            int curNode=(int) cur[1];
            if(curTime>result[curNode]) continue;
            for(int i=0;i<adj.get(curNode).size();i+=2){
                int adjNode=adj.get(curNode).get(i);
                int roadTime=adj.get(curNode).get(i+1);
                if (curTime + roadTime < result[adjNode]) {
                    result[adjNode] = curTime + roadTime;
                    pathCount[adjNode] = pathCount[curNode];
                    pq.offer(new long[]{result[adjNode], adjNode});
                } else if (curTime + roadTime == result[adjNode]) {
                    pathCount[adjNode] = (pathCount[adjNode] + pathCount[curNode]) % MOD;
                }
            }
        }
        return pathCount[n-1];
    }
}
