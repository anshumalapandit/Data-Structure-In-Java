class Solution {
    public int helper(int n,int dp[]){
        // tabulation approach 0(n)
        dp[0]=1;
        if(n<0){
            return 0;
        }
        // tabulation loop
        for(int i=1;i<=n;i++){
           if(i==1){
               dp[i]=dp[i-1]+0; 
           }else{
        dp[i]=dp[i-1]+dp[i-2];
        }
        }
       return dp[n];
    }
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       // Arrays.fill(dp,-1);
        int ans=helper(n,dp);
        return ans;
    }
}
