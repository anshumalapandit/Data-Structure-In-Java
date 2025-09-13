class Solution {
    static int dp[][];
    public int helper(int price[],int length){
        // initialization
        dp=new int[length+1][length+1];
        for(int i=0;i<length+1;i++){
            for(int j=0;j<length+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        // choices program code
        for(int i=1;i<length+1;i++){
            for(int j=1;j<length+1;j++){
                if(i<=j){
                // if current length is <= rod length the cutting possible
                // here length=> i not price 
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[length][length];
    }
    
    public int cutRod(int[] price) {
        // code here
        int length=price.length;
        return helper(price,length);
        
    }
}
