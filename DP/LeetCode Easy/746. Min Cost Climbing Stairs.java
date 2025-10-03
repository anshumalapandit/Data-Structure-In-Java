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
// tabulation  bottom up
import java.util.Arrays;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];  // dp[i] = min cost to reach step i

        // base cases
        dp[0] = 0;  // cost to "stand" before step 0
        dp[1] = 0;  // cost to "stand" before step 1

        // build bottom-up
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], 
                             dp[i-2] + cost[i-2]);
        }

        return dp[n]; // min cost to reach the "top"
    }
}
