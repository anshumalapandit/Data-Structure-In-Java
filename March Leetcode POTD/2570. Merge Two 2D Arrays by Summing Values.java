class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
               int id=nums1[i][0];
               int val=nums1[i][1];
               map.put(id,val);
            }
            for(int i=0;i<nums2.length;i++){
               int id=nums2[i][0];
               int val=nums2[i][1];
               if(map.containsKey(id)){
                int value=map.get(id);
                map.put(id,value+val);
               }else{
               map.put(id,val);
               }
            }
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int ans[][]=new int[map.size()][2];
            for(int key:map.keySet()){
                pq.add(key);
            }
            for(int i=0;i<ans.length;i++){
                int key=pq.poll();
                ans[i][0]=key;
                ans[i][1]=map.get(key);
            }
            return ans;
    }
}
