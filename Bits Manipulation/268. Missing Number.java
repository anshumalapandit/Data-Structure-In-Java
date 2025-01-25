class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        //knowledge of single number approach
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
            ans^=(i+1); // 1 based index approach , same index==numm cancel each other
        }
        return ans;
    }
}
