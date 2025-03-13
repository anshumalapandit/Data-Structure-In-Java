class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int minK = 0;
        if (isZeroArray(nums)) {
                return 0;
         }
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int val = query[2];
            
            // Reduce the range [l, r] by the minimum of nums[i] and vali
            for (int i = l; i <= r; i++) {
                nums[i] -= Math.min(nums[i], val);
            }

            minK++; // Count the query used

            // If the array becomes zero, return the result
            if (isZeroArray(nums)) {
                return minK;
            }
        }
        
        // If the array is not zero after all queries, return -1
        return -1;
    }

    // Helper function to check if the array is zero
    private boolean isZeroArray(int[] nums) {
        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
