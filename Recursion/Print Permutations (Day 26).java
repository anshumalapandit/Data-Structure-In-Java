import java.io.*;
import java.util.*;

public class Solution {
public static void pp(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return;
    }
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        String ros=s.substring(0,i)+s.substring(i+1); // some b4 part some after
        pp(ros,ans+ch);
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        pp(s,"");
    }
}
