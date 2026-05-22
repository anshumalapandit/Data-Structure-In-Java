class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int score=0;
        for(int i=0;i<s.length();i++){
            // if opening bracket hai , put current score in stack
            if(s.charAt(i)=='('){
                st.push(score);
                // reset 
                score=0;
            }else{
                // if we get closing bracket then calculate score
                score=st.peek()+Math.max(2*score,1);
                // 2*score => internal score if present
                // 1=> current bracket (..) no opening bracket
                // pop the internal score 
                st.pop();

            }
        }
        return score;
    }
}

// optimised space :
class Solution {
    public int scoreOfParentheses(String s) {
        // calculating depth of opening bracket excluding opening bracket of internal bracket
        int depth=0;
        int ans=0;
        // hey ? how u will know that this is internal bracket => )(
        char prev='(';
        // if u found ( => d++; else d-- calc ans
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }else{
                depth--;
                if(prev=='(') 
                ans+=Math.pow(2,depth); 
                // if prev = ( , and current is ) , then its is obviously internal bracket thats why we are calc ans
                // imagine => 2* 1+ 2*2 
            }
          prev=s.charAt(i);
        }
        return ans;
    }
}
