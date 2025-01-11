class Solution {
    public String reverse(String cur){
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack();
        for(int i=0;i<cur.length();i++){
            st.push(cur.charAt(i));
        }
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public String reversePrefix(String word, char ch) {
      StringBuilder sb=new StringBuilder();
      if(word.indexOf(ch)==-1){
            return sb.append(word).toString();
        }
      for(int i=0;i<word.length();i++){
        if(word.charAt(i)==ch){
            String cur=word.substring(0,i+1);
            sb.append(reverse(cur));
            String ros=word.substring(i+1,word.length());
            sb.append(ros);
             break;
        }
      }
      return sb.toString();
    }
}
