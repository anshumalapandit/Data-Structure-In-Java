// but its take T.c => 0(n) s.c=> 0(n)
class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            char cur=t.charAt(i);
           if(map.containsKey(cur) && map.get(cur)>0){
               map.put(cur,map.get(cur)-1); // decrese it count;
           }else{
               // if do not contains 
               return cur;
           }
        }
        return ' ';
    }
}
// but yes i can improve space comp using xor approach as it helps us to filter elemnt which extra in t 
class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        char ans=0;
        for(int i=0;i<s.length();i++){
            ans^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
          ans^=t.charAt(j);
        }
        return ans;
    }
}
