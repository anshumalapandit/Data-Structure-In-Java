class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int j=i;
            int newK=0;
        while(j<n && nums[i]==nums[j] && newK<k){
           ans.add(nums[j]);
            j++;
            newK++;
        }
        while(i<n-1 && nums[i]==nums[i+1]){
            i++;
        }

    }
    int arr[]=new int[ans.size()];
    for(int i=0;i<arr.length;i++){
        arr[i]=ans.get(i);
    }
        return arr;
    }
}
    
