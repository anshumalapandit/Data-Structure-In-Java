class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(Character.isLowerCase(cur)){
                st.push(cur);
            }else{
                // digits aaye hai
                st.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
