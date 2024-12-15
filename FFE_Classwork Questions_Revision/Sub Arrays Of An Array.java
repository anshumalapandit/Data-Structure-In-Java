import java.io.*;
import java.util.*;
// Brute force
public class Solution {
public static void subArray(int a[],int n){
    for(int i=0;i<n;i++){
        int start=i;
        for(int j=i;j<n;j++){
            int end=j;
            for(int k=start;k<=end;k++){
             System.out.print(a[k]+" ");   
            }
            System.out.println();
        }
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
        subArray(a,n);
    }
}
