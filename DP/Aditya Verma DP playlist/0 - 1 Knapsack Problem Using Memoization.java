class Solution {
    // declare matrix static 
    static int dp[][];
    public static int helper(int wt[],int val[],int W,int n){
        // base case
        if(n==0 || W==0){
            return 0;
        }
        // before calling recursion i will just check is it already calculated 
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        // choice code
        if(wt[n-1]<=W){
            // if current item weight <= bag capacity then may be i can include it or not
            // i will include only those who will give me maximum profit
            // since we are using memoization so store it as recursion calls return 
            // so that we can use later for further problem
            return dp[n][W]=Math.max(val[n-1]+helper(wt,val,W-wt[n-1],n-1),
            // not included
            helper(wt,val,W,n-1));
        }else if(wt[n-1]>W){
            return dp[n][W]=helper(wt,val,W,n-1);
        }
        return 0;
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        // 1. Memoization approach
        dp=new int[wt.length+1][W+1];
        // Arrays.fill() sirf ek-dimensional array ke liye hai.
        for(int i=0;i<dp.length;i++){
             Arrays.fill(dp[i],-1); // initialise each row with -1
        }
        int n=val.length;
       return helper(wt,val,W,n);
        
    }
}
