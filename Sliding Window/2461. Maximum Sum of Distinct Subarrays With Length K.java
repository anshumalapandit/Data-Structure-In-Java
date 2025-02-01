class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        long sum=0;
        int i=0;
        int j=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i<k){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          sum+=nums[i];
          i++;
        }
        if(map.size()==k){
            ans=Math.max(ans,sum);
        }
        while(i<n){
          sum-=nums[j];
          // also remove from hashmap

          map.put(nums[j],map.get(nums[j])-1);
          if(map.get(nums[j])==0){
            map.remove(nums[j]);
          }
          sum+=nums[i];
          // dont forget to add into map also
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          if(map.size()==k){
            ans=Math.max(ans,sum);
          }
          i++;
          j++;
        }
        return ans;
    }
}
