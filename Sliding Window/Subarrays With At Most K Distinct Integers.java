class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int i=0;
        int j=0;
        int count=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            // operation
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            // what if i had put more element then k
            // shrink karna padega
            while(map.size()>k){
                // shrink=>? remove ith calculation to expand , to inc the window
                map.put(arr[i],map.get(arr[i])-1);
                // if uski freq == 0 ho gyi no need of keeping it remove it
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                // ith remove kar diye now inc ith pointer
                i++;
            }
            // now we will come out of loop only when map.size<=k
            // which is our valid condition
            count+=(j-i+1); 
            // why j-i+1 => window size=>window length=> wahi total no. of subarrays honge
            //e.g [1,2,3] => total 3 subaray , 2-0+1 
            // inc j++ 
            j++;
        }
        return count;
    }
}
