import java.io.*;
import java.util.*;

public class Solution {
public static void printElements(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printElements(a,n);
    }
}
