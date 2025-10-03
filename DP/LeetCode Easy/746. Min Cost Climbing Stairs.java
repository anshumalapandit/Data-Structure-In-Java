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
// Memoization
class Solution {
    static int dp[];
    public int solve(int idx,int cost[]){
        // base case
        if(idx>=cost.length){
            return 0;
        }
        // dp=new int[cost.length+1]; // imp either initialise in main fxn dont here it will reset dp[] in each recursive call
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int curCost=cost[idx]+solve(idx+1,cost);
        int curCost2=cost[idx]+solve(idx+2,cost);
        return dp[idx]=Math.min(curCost,curCost2);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int a=solve(0,cost);
        int b=solve(1,cost);
        int ans=Math.min(a,b);
        return ans;
    }
}
