class Solution {
    // Function to calculate the number of subsets with a given sum
    static int dp[][];
    public int helper(int nums[],int sum){
     // initialization part
     dp[0][0]=1;
     // choice part
     for(int i=1;i<nums.length+1;i++){
         // start for sum==0 
//Let’s say your loop starts from j = 1. That means you're only calculating ways to form positive sums, and ignoring all the ways to form sum = 0. So:

// You won’t count the empty subset.

// You won’t count subsets like [0], [0, 0], etc.

// Your final count will be wrong if the target is 0 or if zeros are involved.
         for(int j=0;j<sum+1;j++){
             if(nums[i-1]<=j){
                 dp[i][j]=dp[i-1][j] + dp[i-1][j-nums[i-1]];
             }else{
                 dp[i][j]=dp[i-1][j];
             }
         }
     }
     return dp[nums.length][sum]; 
    }
    public int perfectSum(int[] nums, int target) {
        // code here
        int n=nums.length;
        dp=new int[n+1][target+1];
        return helper(nums,target);
    }
}
