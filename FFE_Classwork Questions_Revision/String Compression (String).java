import java.io.*;
import java.util.*;

public class Solution {
public static void compressed(String s){
    String ans="";
    String ans2="";
    for(int i=0;i<s.length();i++){
        if(!ans.contains(s.charAt(i)+"")){
             ans+=s.charAt(i);
        }
    }
    System.out.println(ans);
    ans2+=s.charAt(0);
    int count2=1;
    // now for another string
    for(int i=1;i<s.length();i++){
        char prevChar=s.charAt(i-1);
        char cur=s.charAt(i);
        if(prevChar==cur){
            count2++;
        }else{
            if(count2!=1)
            ans2+=count2+"";
            ans2+=cur;
            count2=1;
        }
    }
    if(count2!=1){
        ans2+=count2;
    }
    System.out.println(ans2);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        compressed(s);
    }
}
