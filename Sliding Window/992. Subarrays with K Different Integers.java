class Solution {
    public int atmost(int arr[],int k){
        int i=0;
        int j=0;
        int ans=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            // operation
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            // what if maine jyada elemts add kar diye , invalid ho jayega
            while(map.size()>k){
                // need to shrink
                // jo pehle add kiya remove krarke karke valide banao
                // remove ith and chcek
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                //aage badho keep shrinking jab tak >k hai
                i++;
            }
            // if u have come out its means map.size()<=k hua hoga tabhi
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        // it is similar questions as atmost k
        // here we have to find exactly k distinct integers
        // formula => Exactly(k)= atmost(k)-atmost(k-1)
        int ans=atmost(nums,k)-atmost(nums,k-1);
        return ans;
    }
}
