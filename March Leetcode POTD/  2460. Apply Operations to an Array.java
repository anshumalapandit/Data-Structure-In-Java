class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
           }
        }
        // now move zeroes to end
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==0 && nums[j]==0){
                j++;
            }else if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++; j++;
            }else{
                i++;
                j++;
            }
        }
        return nums;
    }
}
