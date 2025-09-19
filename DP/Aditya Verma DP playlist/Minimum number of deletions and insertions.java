// User function Template for Java

class Solution {
    static int dp[][];
    public int helper(String s1,String s2,int n,int m){
        // initialization
        dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        // choices program code
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
    public int minOperations(String s1, String s2) {
        // Your code goes here
        int n=s1.length();
        int m=s2.length();
        int lcs=helper(s1,s2,n,m);
        int ans1=n-lcs;
        int ans2=m-lcs;
        return ans1+ans2;
    }
}
