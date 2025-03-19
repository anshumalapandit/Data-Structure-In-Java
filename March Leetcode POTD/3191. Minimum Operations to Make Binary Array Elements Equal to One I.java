class Solution {
    public boolean allEleOne(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return false;
            }
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==1){
                continue;
            }else{
            nums[i]=nums[i]==0?1:0;
            nums[i+1]=nums[i+1]==0? 1:0;
            nums[i+2]=nums[i+2]==0?1:0;
            count++;
            }
        }
        if(allEleOne(nums)){
            return count;
        }
        return -1;
    }
}
