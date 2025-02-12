class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<k){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            i++;
        }
        int distinct=map.size();
        ans.add(distinct);
        while(i<arr.length){
            //remove the elemnt which present at jth
            int jth=arr[j];
            map.put(jth,map.get(jth)-1);
            if(map.get(jth)==0){
                map.remove(jth);
            }
            //add the cur ith 
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            //prepare ur ans
            int dis=map.size();
            ans.add(dis);
            j++;
            i++;
        }
        return ans;
    }
}
