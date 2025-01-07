import java.io.*;
import java.util.*;

public class Solution {
public static void displayArray(int n,int arr[],int index){
    if(index==n-1){
        System.out.println(arr[index]);
        return;
    }
    System.out.println(arr[index]);
    displayArray(n,arr,index+1);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        displayArray(n,arr,0);
    }
}
