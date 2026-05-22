class Solution {
    public int maxDistinct(String s) {
        // simply count unique characters
        int count=0;
        boolean freq[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==false){
                // if not present pehle se 
                // occur=> mark it present
                freq[ch-'a']=true;
                count++;
            }
        }
        return count;
    }
}
