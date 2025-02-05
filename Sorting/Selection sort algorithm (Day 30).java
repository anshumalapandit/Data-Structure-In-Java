import java.io.*;
import java.util.*;

public class Solution {
public static void swap(int start,int end,int a[]){
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
}
public static void ss(int a[],int n){
    for(int i=0;i<n-1;i++){
        int minIdx=i;
        for(int j=i+1;j<n;j++){
            if(a[j]<a[minIdx]){
                minIdx=j;
            }
        }
        swap(minIdx,i,a);
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
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
        ss(a,n);
    }
}
