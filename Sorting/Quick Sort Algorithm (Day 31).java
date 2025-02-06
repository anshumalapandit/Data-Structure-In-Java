import java.io.*;
import java.util.*;

public class Solution {
public static void swap(int a[],int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
public static int find(int a[],int low,int high,int pivot){
    int i=low;
    int j=low;
    while(i<=high){
        if(a[i]<=pivot){
        swap(a,i,j);
        i++;
        j++;
        }else{
            i++;
        }
    }
    return j-1;
}
public static void qs(int a[],int low,int high){
    if(low>high){
        return;
    }
    int pivot=a[high];
    int Pidx=find(a,low,high,pivot); // sort according to pivot
    // now merge them
    qs(a,low,Pidx-1);
    qs(a,Pidx+1,high);
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        qs(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
