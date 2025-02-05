import java.io.*;
import java.util.*;

public class Solution {
public static void swap(int arr[],int start,int end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
}
public static void sort01(int a[],int n){
    int i=0,j=0;
    while(i<n){
        if(a[i]==0){
            swap(a,i,j);
            i++; j++;
        }else {
            i++;
        }
    }
    for(i=0;i<n;i++){
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
        sort01(a,n);
    }
}
