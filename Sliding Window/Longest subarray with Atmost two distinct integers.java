class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n=arr.length;
        int i=0;
        int j=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            // if freq >k 
            if(map.size()>2){
                // remove 
                while(map.size()!=2){
                    int freq=map.get(arr[i]);
                    if(freq-1==0){
                        map.remove(arr[i]);
                    }else{
                        map.put(arr[i],freq-1);
                    }
                    i++;
                }
            }
            if(map.size()==2){
                // count all freqs 
                int count=0;
                for(int key:map.keySet()){
                    count+=map.get(key);
                }
                if(count>ans){
                    ans=count;
                }
            }
            j++;
        }
        return ans;
    }
}
