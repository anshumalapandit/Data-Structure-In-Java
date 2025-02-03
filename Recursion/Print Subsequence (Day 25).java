import java.io.*;
import java.util.*;

public class Solution {
public static void ps(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return;
    }
   char ch=s.charAt(0);
    String ros=s.substring(1);
    ps(ros,ans+ch); // part of answer
    ps(ros,ans); // not part of an asnwer
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ps(s,"");
    }
}
