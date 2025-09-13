class Solution {
    static int dp[][];

    public int helper(int coins[],int amount){
      // initialization
      // first we initilise first row and col
      dp=new int[coins.length+1][amount+1];
      for(int i=0;i<coins.length+1;i++){
        for(int j=0;j<amount+1;j++){
            if(i==0){
                dp[i][j]=Integer.MAX_VALUE-1;
            }
            if(j==0 && i!=0){
                dp[i][j]=0;
            }
        }
      }
      // now lets fill second row and col
      for(int i=1;i<coins.length+1;i++){
      for(int j=1;j<amount+1;j++){
          if((j%coins[0])==0){
            dp[i][j]=j/coins[0];
          }else{
            // if divide nhi hua then we need infinite no. of coins
            dp[i][j]=Integer.MAX_VALUE-1;
          }
      }
      }
      // choices program code
      for(int i=2;i<coins.length+1;i++){
        for(int j=2;j<amount+1;j++){
            if(coins[i-1]<=j){
                // if current coins which i am taking is <= sum which i want 
                // i have 2 choices either i can take it or not take it
                dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1, dp[i-1][j]);
            }else{
                dp[i][j]=dp[i-1][j];
            }
        }
      
}
 if (dp[coins.length][amount] >= Integer.MAX_VALUE - 1) {
         return -1;
 }
return dp[coins.length][amount];
      
    }

    public int coinChange(int[] coins, int amount) {
        return helper(coins, amount);
    }
}
