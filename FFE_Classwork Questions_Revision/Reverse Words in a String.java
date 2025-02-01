import java.io.*;
import java.util.*;

public class Solution {
public static String reverseWords(String s){
    String arr[]=s.trim().split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=arr.length-1;i>=0;i--){
        sb.append(arr[i]+" ");
    }
    return sb.toString();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
