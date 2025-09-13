class Solution {
    static int dp[][];
    public int targetSum(int nums[],int target){
        // initialization part
        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<target+1;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        // choices program code
        for(int i=1;i<nums.length+1;i++){
            for(int j=0;j<target+1;j++){
                if(nums[i-1]<=j){
                    // we have 2 choices
                    dp[i][j]= dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    // if total sum is < target its impossivle to do partition
    if(sum<target){
        return 0;
    }
    if((sum+target)<0){
        return 0;
    }
    if((sum+target)%2!=0){
        return 0; // no ways of partition
    }
    int s=(sum+target)/2;
      dp=new int[nums.length+1][s+1];
      return targetSum(nums,s);
    }
}
