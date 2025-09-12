
class Solution {
    static int dp[][];
    public int countOfSubsetSum(int arr[],int sum){
        // initialization
        dp = new int[arr.length+1][sum+1];
        dp[0][0]=1;
        for(int j=1;j<sum+1;j++){
            dp[0][j]=0;
            // array ka size=0 , sum =1,2,3 => not possible
        }
        // choice program code
        for(int i=1;i<arr.length+1;i++){
            for(int j=0;j<sum+1;j++){
                if(arr[i-1]<=j){
                    // then we have 2 choices
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        // i know answer will store at last idx
        return dp[arr.length][sum];
    }
    int countPartitions(int[] arr, int d) {
        // code here
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        // hey what if d> sum is it possible 
        // No . so not valid partition will exit
        if((d+total)%2!=0){
            // if odd hoga to partition possible hi nhi hai 
            return 0;
        }
        int sum=(d+total)/2;
    
        return countOfSubsetSum(arr,sum);
    }
}
