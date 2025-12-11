//sliding window approach:
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            // j k pehle jitne bhi lesser element = never used =popped
            while(list.size()>0 && list.get(list.size()-1)<arr[j]){
                list.remove(list.size()-1);
            }
            // jese hi remove ho jayega add current jth ele
            list.add(arr[j]);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                // if window size acheieved hai then try to maintain it
                // 1. ans calculate kro calculation mai se
                ans.add(list.get(0));
                // 2. remove calculation b4 sliding the window .
                // slide kese karte i->i++, j->j++
                // ith wala element ko remove karna padega
                // if ith wala present hoga to pehle hi present hoga bcoz we inserted only kaam ka value .
                if(arr[i]==list.get(0)){
                    list.remove(0);
                }
                // slide the window
                i++;
                j++;
            }
        }
        return ans;
    }
}
// incorrect approach but good for learning , only few test cases will paas not will handle all
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int max=0;
        int i=0;
        int j=0;
        while(j<arr.length){
            max=Math.max(max,arr[j]);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                ans.add(max);
                // before sliding update the max 
                // i...j size ka ek window hota hai 
                // window move by 1 step i...j
                // if my maximum is same as first element then its wrong its means
                // it is belonging to previous window if it is then i will never get max  of cur window
                if(max==arr[i]){
                    // choose another maximum of this window now
                    // now we dont have any mechanism to retrive maximum from that window
                }
                // slide the window
                i++;
                j++;
            }
        }
        return ans;
    }
}
