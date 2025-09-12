class Solution {
    static boolean dp[][];
    public int helper(int nums[],int sum){
        // initialization
        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        // choice program code
        for(int i=1;i<nums.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    // 2 choices include it or not
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        // 
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= sum; j++) {
            if (dp[nums.length][j]) {
                ans = Math.min(ans, Math.abs(sum - 2*j));
            }
        }
        return ans;
    }
    public int minDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum<0){
            return 0;
        }
        dp=new boolean[nums.length+1][sum+1];
        return helper(nums,sum);
    }
}
