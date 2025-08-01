class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean vis[]=new boolean[n];
        PriorityQueue<int []> minheap=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        // we are sorting based on costs 
        // a- cost
        // b- points
        minheap.add(new int[]{0,0});
        int totalCost=0;
        int edgesUsed=0;
        while(edgesUsed<n){
         int p[]=minheap.poll();
         int cost=p[0];
         // mark visited
         // points no=> p[1]
         if(vis[p[1]]) continue; 
         
         vis[p[1]]=true;
         totalCost+=cost;
         edgesUsed++;
         for (int i = 0 ; i < n ; i++){
                //Iterating over all pts 0 till n
                if (!vis[i]){
                    int dis = Math.abs(points[p[1]][0] - points[i][0]) + Math.abs(points[p[1]][1] - points[i][1]);
                minheap.offer(new int[]{dis , i});
                }
            }
        }
        return totalCost;
}
}
