import java.io.*;
import java.util.*;

public class Solution {
public static void printInc(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    printInc(n-1);
    System.out.println(n);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printInc(n);
    }
}
