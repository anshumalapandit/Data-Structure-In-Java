import java.io.*;
import java.util.*;

public class Solution {
public static int maxArea(int arr[],int n){
    int i=0;
    int j=n-1;
    int ans=Integer.MIN_VALUE;
    while(i<j){
       int minHT=Math.min(arr[i],arr[j]);
        int tempArea=minHT*(j-i);
        if(ans<tempArea){
            ans=tempArea;
        }
        if(arr[i]<arr[j]){
            i++;
        }else{
            j--;
        }
        
            
    }
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxArea(arr,n));
    }
}
