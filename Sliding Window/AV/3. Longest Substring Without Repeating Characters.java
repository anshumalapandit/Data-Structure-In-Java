class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        while(j<s.length()){
            char cur=s.charAt(j);
            if(set.contains(cur)==false){
                // if not contains add it
                set.add(cur);
                ans=Math.max(ans,j-i+1);
                j++;
            }else{
                // if its contains
                //then we have to remove the ith element
                char ith=s.charAt(i);
                set.remove(ith);
                i++;
            }
        }
        return ans;
    }
}
