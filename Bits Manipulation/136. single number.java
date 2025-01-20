class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        // same number ka xor =0
        // oppsite number ka xor =1
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
