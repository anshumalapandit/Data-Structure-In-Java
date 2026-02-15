class Solution {
    public int subarraySum(int[] nums, int k) {
        // step 1: calculate prefix sum and its freq
        int prefixSum[]=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        // step 2 , stores its freq , put into map
        HashMap<Integer,Integer> map=new HashMap<>();
        // dont build earlier , otherwise u will end up taking future jth ps
        // for(int i=0;i<nums.length;i++){
        //     map.put(prefixSum[i],map.getOrDefault(prefixSum[i],0)+1);
        // }
        // now use formula : ps[j]-ps[i-1]==k
        // i have calculated ps[j], ps[i-1]=ps[j]-k
        // ⭐ MOST IMPORTANT LINE
        // map.put(0, 1);   // handles subarrays starting from index 0
        // or add this condition => if(ps[j]==k) count++;

        int count=0;
        for(int j=0;j<nums.length;j++){
            // edge case 
            if(prefixSum[j] == k) count++;
            int value=prefixSum[j]-k;
            // how check this values how many times occur
            // jitne times occur hua hai count utne times
            // dont use directly map.get(value) , what if value key present hi nhi hoga ?
            // u can aslo use if(map.containsKey(value)) count+=map.get(value)
            int freq=map.getOrDefault(value,0);
            count+=freq;
            map.put(prefixSum[j],map.getOrDefault(prefixSum[j],0)+1);
        }
        return count;
    }
}
