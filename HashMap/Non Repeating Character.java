class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
           char cur=s.charAt(i);
           if(!map.containsKey(cur)){
               map.put(cur,map.getOrDefault(cur,0)+1);
           }else{
               int freq=map.get(cur);
               map.put(cur,freq+1);
           }
       }
       // now check
       for(int i=0;i<s.length();i++){
           char cur=s.charAt(i);
           if(map.containsKey(cur)){
               int freq=map.get(cur);
               if(freq==1){
                   return cur;
               }
           }
       }
       return '$';
    }
}
