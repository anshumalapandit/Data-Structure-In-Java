import java.io.*;
import java.util.*;

public class Solution {
public static int[] mergeTwoArr(int left[],int right[]){
    int n1=left.length;
    int n2=right.length;
    int i=0,j=0,k=0;
    int res[]=new int[n1+n2];
    while(i<n1 && j<n2){
        if(left[i]<right[j]){
            res[k++]=left[i++];
        }else{
            res[k++]=right[j++];
        }
    }
    // now add remaining ele
    while(i<n1){
        res[k++]=left[i++];
    }
    while(j<n2){
        res[k++]=right[j++];
    }
    return res;
}
public static int[] mergeSort(int a[],int low,int high){
    if(low==high){
        int base[]=new int[1];
        base[0]=a[low];
        return base;
    }
    int mid=(low+high)/2;
    int left[]=mergeSort(a,low,mid); // why u forget to pass low dont pass 0 pass low ..get it
    int right[]=mergeSort(a,mid+1,high);
    return mergeTwoArr(left,right);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans[]=mergeSort(a,0,n-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
