// User function Template for Java

class Solution {
    public long countFriendsPairings(int n) {
        // code here
        long dp[]=new long[n+1]; // factorial store karenge
        dp[0]=1; // factorial of 0 is 1
        dp[1]=1; 
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
}
