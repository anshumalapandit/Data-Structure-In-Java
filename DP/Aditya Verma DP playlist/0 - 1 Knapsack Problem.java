class Solution {
    public static int helper(int wt[],int val[],int W,int n){
        // base case
        if(n==0 || W==0){
            return 0;
        }
        // choice code
        if(wt[n-1]<=W){
            // if current item weight <= bag capacity then may be i can include it or not
            // i will include only those who will give me maximum profit
            return Math.max(val[n-1]+helper(wt,val,W-wt[n-1],n-1),
            // not included
            helper(wt,val,W,n-1));
        }else if(wt[n-1]>W){
            return helper(wt,val,W,n-1);
        }
        return 0;
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        // 1. recursive approach
        int n=val.length;
       return helper(wt,val,W,n);
        
    }
}
