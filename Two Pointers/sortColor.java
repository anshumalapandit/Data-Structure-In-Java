import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
public static void sortColor(int arr[],int n){
    int i=0;
    int j=0;
    int k=n-1;
    while(i<=k){
        if(arr[i]==0){
            swap(arr,i,j);
            i++;
            j++;
        }else if(arr[i]==1){
            // do nothing only inc i++
            i++;
        }else{
            swap(arr,i,k);
            k--;
        }
    }
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortColor(arr,n);
        //print
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
