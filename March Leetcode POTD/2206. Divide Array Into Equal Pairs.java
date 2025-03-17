class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        boolean validPair=true;
        for(int i=0;i<=nums.length-2;i+=2){
            int first=nums[i];
            int second=nums[i+1];
            if(first!=second){
                return false;
            }
        }
        return true;
    }
}
// optimised approach:
class Solution {

    public boolean divideArray(int[] nums) {
        // Count frequency of each number
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Check if each number appears even number of times
        for (int num : frequency.keySet()) {
            if (frequency.get(num) % 2 != 0) {
                return false;
            }
        }

        // All numbers can be paired
        return true;
    }
}
