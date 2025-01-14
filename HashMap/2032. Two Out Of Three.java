class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       List<Integer> Fans=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        HashMap<Integer,Integer> map3=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums3.length;i++){
            map3.put(nums3[i],map3.getOrDefault(nums3[i],0)+1);
        }
        HashSet<Integer> ans=new HashSet<>();
        for(int key:map1.keySet()){
            // lets check same key both array hai
            if(map2.containsKey(key) || map3.containsKey(key)){
                ans.add(key);
            }
        }
        for(int key:map2.keySet()){
         
            if(map1.containsKey(key) || map3.containsKey(key)){
                ans.add(key);
            }
        }
        for(int key:ans){
            Fans.add(key);
        }
        return Fans;
    }
}
