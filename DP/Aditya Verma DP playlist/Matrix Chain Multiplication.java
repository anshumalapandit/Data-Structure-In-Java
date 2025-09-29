class Solution {
    static int dp[][];
    public static int helper(int arr[], int i, int j) {
        // base case
        if (i >= j) {
            return 0;
        }
        // dp = new int[arr.length + 1][arr.length + 1]; // ❌ Wrong: you are re-initializing dp every time
        
        // check kro kya pehle se answer exist hai
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
         int min = Integer.MAX_VALUE; // ✅ local for this subproblem
        for (int k = i; k < j; k++) { // ❌ condition wrong in your code (j-1). Should be < j
            // divide
            int tempans = helper(arr, i, k) 
                        + helper(arr, k + 1, j) 
                        + arr[i - 1] * arr[k] * arr[j]; // ❌ multiplication formula should be product, not sum

            // ❌ wrong comparison. You need min cost, so use Math.min
            min = Math.min(tempans,min);
            
        }
        return dp[i][j] = min;
    }

    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        dp = new int[n + 1][n + 1];  // ✅ initialize only once here
        for (int d[] : dp) {
            Arrays.fill(d, -1);
        }
        return helper(arr, 1, n - 1);
    }
}
