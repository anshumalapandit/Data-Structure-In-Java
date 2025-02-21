class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1=1;
            }else if(count2==0 && ele1!=nums[i]){
                ele2=nums[i];
                count2=1;
            }else if(ele1==nums[i]){
                  count1++;
            }else if(ele2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        // now manually check kro
        List<Integer> ans=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]) count1++;
            if(ele2==nums[i]) count2++;
        }
        int n=nums.length;
        int min_required=(int)(n/3)+1;
        if(count1>=min_required) ans.add(ele1);
        if(count2>=min_required) ans.add(ele2);
        return ans;
    }
}
