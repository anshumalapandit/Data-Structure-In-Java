import java.io.*;
import java.util.*;

public class Solution {
public static void swap(int a[],int start,int end){
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
}
public static void sort012(int a[],int n){
    int i=0,j=0;
    int k=n-1; // remember k last se start hota hai
    while(i<=k){
        if(a[i]==0){
            swap(a,i,j);
            i++;
            j++;
        }else if(a[i]==1){
            i++;
        }else{
            swap(a,i,k);
            k--;
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
        sort012(a,n);
    }
}
