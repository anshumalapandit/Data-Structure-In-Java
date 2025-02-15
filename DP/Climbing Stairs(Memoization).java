class Solution {
    public int helper(int n,int dp[]){
        // memoization approach T.C=> 0(n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){ // already calculated dont make repetititve call return this value who call this
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
       return dp[n];
    }
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       // Arrays.fill(dp,-1);
        int ans=helper(n,dp);
        return ans;
    }
}
