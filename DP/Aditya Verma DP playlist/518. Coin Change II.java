class Solution {
    static int dp[][];
    public int helper(int coins[],int amount){
        // initialization
        dp=new int[coins.length+1][amount+1];
        for(int i=0;i<coins.length+1;i++){
            for(int j=0;j<amount+1;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0 ){
                    dp[i][j]=1;
                }
            }
        }
        // choices program code
        for(int i=1;i<coins.length+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1]<=j){
                    // if current coints is <= amount needed then only i can take count and sum up == amount
                    // coins =9, amount needed 7 not possible 9 is > kabhi 7 milega hi nhi sum karke
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }
    public int change(int amount,int[] coins) {
        int n=coins.length;
        
        return helper(coins,amount);
        // coins== wt
        // amount==sum
    }
}
