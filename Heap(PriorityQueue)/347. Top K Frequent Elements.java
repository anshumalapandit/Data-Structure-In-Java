class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> bucket[]=new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int value=map.get(key);
            if(bucket[value]==null){
                bucket[value]=new ArrayList<>();
            }
            bucket[value].add(key);
        }
        // traverse from last and add all to in single list
        List<Integer> arr=new ArrayList<>();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                arr.addAll(bucket[i]);
            }
            if(arr.size()==k) break; // remember we want only k frequent so stored only k 
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i);
        }
        return ans; 
    }
}
