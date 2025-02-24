class Solution {
    public boolean isPresent(ArrayList<Integer> arr,int cur){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==cur){
                return true;
            }
        }
        return false;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
               arr.add(nums1[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int cur=nums2[i];
            if(isPresent(arr,cur)){
                ans.add(cur);
                // now remove it from arraylist to avoid redunduncy
                arr.remove(Integer.valueOf(cur));
            }
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
