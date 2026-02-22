class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        // HashMap+ Prefix XOR
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int preXor=0;
        int ans=0;
        while(i<arr.length){
            // step 1: calculate prefix XOR 
            preXor^=arr[i];
            // now 2 scenerio 
            // 1. if this till point itself xor==k means there is no external [] whose xor==k
            // calculate answer directly
            if(preXor==k){
                ans++;
            }
            // 2. calculate x^k is this exist ? its means there will be definitely one sub [] 
            // whose xor ==k ,
            if(map.containsKey(preXor^k)){
                // jitne baar present hai , utni baar freq add answer kro
                int freq=map.get(preXor^k);
                ans+=freq;
            }
            // add current prefix Xor to the map 
            map.put(preXor,map.getOrDefault(preXor,0)+1);
            i++;
        }
        return ans;
    }
}
