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
