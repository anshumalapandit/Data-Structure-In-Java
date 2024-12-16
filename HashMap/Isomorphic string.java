class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            char replaced=t.charAt(i);
            if(!map.containsKey(cur)){
                if(map.containsValue(replaced)){
                    return false; // its means it already mapped with others 
                }
                map.put(cur,replaced);
            }else{
                // already exist
                if(map.get(cur)!=replaced){
                    return false;
                }
            }
        }
        return true;
    }
}
