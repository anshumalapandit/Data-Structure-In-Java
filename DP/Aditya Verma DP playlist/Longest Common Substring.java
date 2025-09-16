// User function Template for Java

class Solution {
    static int dp[][];
    public int helper(String s1,String s2,int n,int m){
        // initialisation
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
                    dp[i][j]=0;
                }
            }
        }
        // longest common string kahi pe bhi end ho sakta hai bich mai bhi ho sakta hai
        // we cant return dp[n][m] here bcoz answer cannot be stored at last idx 
        // largest common string kahi bhi ho sakta hai in between dp 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
               max= Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        dp=new int[n+1][m+1];
         return helper(s1,s2,n,m);
    }
}
