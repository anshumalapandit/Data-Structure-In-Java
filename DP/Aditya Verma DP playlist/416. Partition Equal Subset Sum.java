class Solution {
    // i will gonna use tabulation
    static boolean dp[][];
    public boolean subsetSum(int nums[],int sum,int n){
      // inilitialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
      }
      // choice program 
      for(int i=1;i<n+1;i++){
        for(int j=1;j<sum+1;j++){
          if(nums[i-1]<=j){
            // we have 2 choices
            // if we included then we have to reduced sum by that ammount
            dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
          }else{
            // cur element > sum se no use of taking i will check further 
            dp[i][j]=dp[i-1][j];
          }
        }
      }
    return dp[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum+nums[i];
        }
        if(totalSum%2!=0){
            return false;
        }else{
            dp=new boolean[nums.length+1][(totalSum/2)+1];
            return subsetSum(nums,totalSum/2,nums.length);
        }
    }
}
