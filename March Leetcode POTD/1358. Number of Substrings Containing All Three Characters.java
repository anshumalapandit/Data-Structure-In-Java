class Solution {
    public boolean validSub(String s){
        boolean a=false;
        boolean b=false;
        boolean c=false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            a=true;
        }else if(s.charAt(i)=='b'){
            b=true;
        }else if(s.charAt(i)=='c'){
            c=true;
        }
       }
       if(a && b && c)
        return true;
        return false;
    }
    public int numberOfSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
         for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            if(validSub(sub)){
                count++;
            }
         }
        }
        return count;
    }
}
// optimised way:
class Solution {
    public boolean validSub(int freq[]){
        return freq[0]>0 && freq[1]>0 && freq[2]>0;
    }
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int count=0;
        int freq[]=new int[3];
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'a']++;
            while(validSub(freq)){
                count+=s.length()-right;
                // dec the freq of left 
                char leftChar=s.charAt(left);
                freq[leftChar-'a']--;
                left++;
            }
            right++;
        }
        return count;
    }
}
