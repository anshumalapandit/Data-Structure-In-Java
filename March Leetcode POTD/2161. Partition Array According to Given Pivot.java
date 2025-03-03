class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        List<Integer> smallP=new ArrayList<>();
        List<Integer> largeP=new ArrayList<>();
        List<Integer> equalP=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                smallP.add(nums[i]);
            }else if(nums[i]>pivot){
                largeP.add(nums[i]);
            }else{
                equalP.add(nums[i]);
            }
        }
        int idx=0;
        for(int i=0;i<smallP.size();i++){
            ans[idx]=smallP.get(i);
            idx++;
        }
        for(int i=0;i<equalP.size();i++){
            ans[idx++]=equalP.get(i);
        }
        for(int i=0;i<largeP.size();i++){
            ans[idx++]=largeP.get(i);
        }
        return ans;
    }
}
