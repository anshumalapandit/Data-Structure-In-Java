import java.io.*;
import java.util.*;

public class Solution {
public static void pe(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return ;
    }
    char ch=s.charAt(0);
    if(ch=='0'){
        return;
    }
    int num1=ch-'0'; 
    String ros=s.substring(1);
    char d1=(char)(num1-1+'a');
    pe(ros,ans+d1);
    if(s.length()>=2){
        // also consider 2 number combination 24->convert into int
        int num2=Integer.parseInt(s.substring(0,2));
        // make sure ye two digit 26 se chota ho..
        if(num2<=26){
        char d2=(char)(num2-1+'a');
        String ros2=s.substring(2);
        pe(ros2,ans+d2);
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        pe(str,"");
    }
}
