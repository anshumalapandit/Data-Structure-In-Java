class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // sort ascending
        // check triplets from the end
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                // valid triangle found
                // turant return kar dena hai bcoz we already sorted it we know ki largest side wala side last mai hi 
                // hoga as soon as u get valid triangle just return it 
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0; // no valid triangle
    }
}
