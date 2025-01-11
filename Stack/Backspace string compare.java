class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s.length()==0 && t.length()==0){
            return true;
        }
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }else{
                if(s1.size()>0)
                s1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                s2.push(t.charAt(i));
            }else{
                if(s2.size()>0)
                s2.pop();
            }
        }
        String a1="";
        String a2="";
        while(s1.size()>0){
            a1+=s1.pop();
        }
        while(s2.size()>0){
            a2+=s2.pop();
        }
        return a1.equals(a2);
    }
}
