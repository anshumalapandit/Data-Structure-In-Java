import java.io.*;
import java.util.*;

public class Solution {
public static void countOdd(int a[],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int sum=a[i]+a[j];
            if(sum%2!=0){
                System.out.println(a[i]+" "+a[j]);
            }
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
        countOdd(a,n);
    }
}
