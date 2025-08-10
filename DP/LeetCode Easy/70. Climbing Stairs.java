class Solution {
    public int helper(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){ // already calculate just use it
            return dp[n]; // return that value its already calculate ☺️
        }
        // if not calculate then just call and dont forget to store it 
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        // i kno my answwer last idx pe hi store hoga ..so return last idx wala position value
       return dp[n];
    }
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=helper(n,dp);
        return ans;
    }
}
