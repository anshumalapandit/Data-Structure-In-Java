// what is sliding window ?
// it is technique to solve in better time complixity
/* there are 2 types of window
 1. fixed size window = u define the size at a time of what size of window u r considering
 2. varible size window = window size always keep changing */
  // this is an xample of fixed size
import java.io.*;
import java.util.*;

public class Solution {
public static int CountGoodString(String s){
    int i=0;
    int j=0;
    int count=0;
    while(j<s.length()){
        if(j-i+1==3){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            char c3=s.charAt(i+2);
            if(c1!=c2 && c2!=c3 && c1!=c3){
                count++;
            }
            i++;
        }
        j++;
    }
    return count;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(CountGoodString(s));
    }
}
