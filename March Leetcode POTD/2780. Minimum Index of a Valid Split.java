class Solution {
    public int[] splitArray(List<Integer> arr,int start,int end){
        int idx=0;
        if(start>end) return new int[0];
        int ar[]=new int[end-start+1];
        for(int i=start;i<=end;i++){
            ar[idx]=arr.get(i);
            idx++;
        }
        return ar;
    }
    public int find(int arr[]){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        if(map.get(arr[i])>arr.length/2){
            return arr[i];
        }
       }
       for(int key:map.keySet()){
        int freq=map.get(key);
        if(freq>arr.length/2){
            return key;
        }
       }
        return -1;
    }
    public int minimumIndex(List<Integer> nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int oneHalf[]=splitArray(nums,0,i);
            int otherHalf[]=splitArray(nums,i+1,nums.size()-1);
            int domEle1=find(oneHalf);
            int domEle2=find(otherHalf);
            if(domEle1!=-1 && domEle1==domEle2){
                ans=Math.min(ans,i);
                break;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            map2.put(nums.get(i),map2.getOrDefault(nums.get(i),0)+1);
        }
        for(int i=0;i<nums.size();i++){
            int cur=nums.get(i);
            // now we remove the same elem from map and add same elem in map1
            map1.put(nums.get(i),map1.getOrDefault(nums.get(i),0)+1);
            int freq=map2.get(cur);
            map2.put(cur,freq-1);
            if(freq==0)
            map2.remove(cur);
            // size of map1
            int n1=i+1;
            int n2=nums.size()-i-1;
            if(map1.get(cur)>n1/2 && map2.get(cur)>n2/2){
                return i;
            }
        }
        return -1; // if no valid move possible
    }
}
