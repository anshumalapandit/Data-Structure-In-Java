import java.io.*;
import java.util.*;

public class Solution {
public static int operation(int op1,int op2,char op){
    if(op=='*'){
        return op1*op2;
    }else if(op=='-'){
        return op1-op2;
    }else if(op=='+'){
        return op1+op2;
    }
    return op1/op2;
}
public static int precendence(char cur){
    if(cur=='*' || cur=='/'){
        return 2;
    }else if(cur=='+' || cur=='-'){
        return 1;
    }
    return 0;
}
public static void infix(String s){
    Stack<Integer> s1=new Stack<>();
    Stack<Character> s2=new Stack<>();
    for(int i=0;i<s.length();i++){
        char cur=s.charAt(i);
        if(cur=='('){
            s2.push(cur);
        }else if(cur>='0' && cur<='9'){
            s1.push(cur-'0');
        }else if(cur==')'){
            // removed until u found opening bracket + perform operations too
            while(s2.peek()!='('){
                int op2=s1.pop();
                int op1=s1.pop();
                char op=s2.pop();
                int ans=operation(op1,op2,op);
                s1.push(ans);
            }
            s2.pop();
        }else if(cur=='+' || cur=='-' || cur=='*' || cur=='/'){
            while(s2.size()>0 && precendence(s2.peek())>=precendence(cur)){
                // remove it + perform operation
                int op2=s1.pop();
                int op1=s1.pop();
                char op=s2.pop();
                int ans=operation(op1,op2,op);
                s1.push(ans);
            }
            s2.push(cur);
        }
    }
    // for remaining
    while(s2.size()>0){
        int op2=s1.pop();
        int op1=s1.pop();
        char op=s2.pop();
        int ans=operation(op1,op2,op);
        s1.push(ans);
    }
    System.out.println(s1.pop());
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        infix(str);
    }
}
