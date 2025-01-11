import java.io.*;
import java.util.*;

public class Solution {
public static boolean balanced(String s){
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char cur=s.charAt(i);
        if(cur=='(' || cur=='[' || cur=='{'){
            st.push(cur);
        }else if((cur==')' || cur==']' || cur=='}' ) && st.size()>0){
            if(cur==')' && st.peek()=='('){
                st.pop();
            }
           else if(cur==']' && st.peek()=='['){
                st.pop();
            }
            else if(cur=='}' && st.peek()=='{'){
                st.pop();
            }
        }
    }
    return st.isEmpty();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(balanced(s));
    }
}
