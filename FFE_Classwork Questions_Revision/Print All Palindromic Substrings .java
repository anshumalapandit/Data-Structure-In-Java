import java.io.*;
import java.util.*;

public class Solution {
public static boolean isPal(String s){
    int start=0;
    int end=s.length()-1;
    while(start<=end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
public static void printAll(String s){
    for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String cur=s.substring(i,j+1);
            if(isPal(cur)){
                System.out.println(cur);
            }
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printAll(s);
    }
}
