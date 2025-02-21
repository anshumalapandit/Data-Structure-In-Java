class Solution {
    public int majorityElement(int[] nums) {
        int prev=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(count==0){
                prev=nums[i];
                count=1;
            }else if(prev==cur){
                count++;
            }else if(prev!=cur){
                count--;
            }
        }
        return prev;
    }
}
