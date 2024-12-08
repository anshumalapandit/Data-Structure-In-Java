// brute force :
import java.io.*;
import java.util.*;

public class Solution {
public static int maxSubarray(int arr[],int n){
    int maxsum=Integer.MIN_VALUE;
    int cursum=0;
    for(int i=0;i<n;i++){
        int start=i;
        for(int j=0;j<n;j++){
            int end=j;
            cursum=0;
            for(int k=start;k<=end;k++){
                cursum+=arr[k];
            }
        if(maxsum<cursum){
            maxsum=cursum;
        }
        }
    }
    return maxsum;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubarray(arr,n));
    }
}
