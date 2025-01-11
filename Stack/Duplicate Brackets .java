import java.io.*;
import java.util.*;

public class Solution {
public static boolean db(String s){
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char cur=s.charAt(i);
        if(cur!=')'){
            st.push(cur);
        }else{
            if(st.peek()=='('){
                return true;
            }
            while(st.peek()!='('){
                st.pop();
            }
            st.pop();
        }
    }
    return false;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(db(s));
    }
}
