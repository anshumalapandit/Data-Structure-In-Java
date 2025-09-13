// User function Template for Java

class Solution {
    static int dp[][];
    public static int helper(int val[],int wt[],int c){
        // initialization
        for(int i=0;i<val.length+1;i++){
            for(int j=0;j<c+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        // choice program
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<c+1;j++){
                if(wt[i-1]<=j){ // if current item weight is less than my bag capacity then only 
                    dp[i][j]= Math.max(val[i-1]+dp[i][j-wt[i-1]],
                    dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[val.length][c];
    }
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        dp=new int[n+1][capacity+1];
        return helper(val,wt,capacity);
    }
}
