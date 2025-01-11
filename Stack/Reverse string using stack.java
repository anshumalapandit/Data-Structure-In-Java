import java.io.*;
import java.util.*;

public class Solution {
public static String reverse(String s){
    Stack<Character> st=new Stack<>();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        st.push(s.charAt(i));
    }
    while(st.size()>0){
        sb.append(st.pop());
    }
    return sb.toString();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
}
