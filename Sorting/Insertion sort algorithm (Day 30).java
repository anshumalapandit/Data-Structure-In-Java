import java.io.*;
import java.util.*;

public class Solution {
public static void swap(int start,int end,int arr[]){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
}
public static void is(int a[],int n){
    for(int i=1;i<n;i++){
        int j=i-1;
        while(j>=0){
            if(a[j]>a[j+1])
            swap(j,j+1,a);
            else
                break;
            j--;
        }
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
        is(a,n);
    }
}
