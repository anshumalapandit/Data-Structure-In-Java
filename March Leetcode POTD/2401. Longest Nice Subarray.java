class Solution {
    public int longestNiceSubarray(int[] nums) {
            int max=1;
            for(int i=0;i<nums.length;i++){
                int cur=0;
                for(int j=i;j<nums.length;j++){
                if ((cur & nums[j]) != 0) break; // Conflict found, stop checking
                  cur |= nums[j]; // Add nums[j] to the bitmask
                    max=Math.max(max,j-i+1);
                  
                }
            }
            return max;
    }
}
