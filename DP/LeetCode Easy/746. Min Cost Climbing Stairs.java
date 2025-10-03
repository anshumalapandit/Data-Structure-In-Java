class Solution {
    public int solve(int idx,int cost[]){
        // base case
        if(idx>=cost.length){
            return 0;
        }
        int curCost=cost[idx]+solve(idx+1,cost);
        int curCost2=cost[idx]+solve(idx+2,cost);
        return Math.min(curCost,curCost2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int a=solve(0,cost);
        int b=solve(1,cost);
        int ans=Math.min(a,b);
        return ans;
    }
}
