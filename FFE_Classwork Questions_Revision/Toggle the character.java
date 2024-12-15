import java.io.*;
import java.util.*;

public class Solution {
public static char toggleChar(char ch){
    if(ch>='a' && ch<='z'){
        ch=(char)(ch-32);
    }else if(ch>='A' && ch<='Z'){
        ch=(char)(ch+32);
    }
    return ch;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        System.out.println(toggleChar(ch));
    }
}
