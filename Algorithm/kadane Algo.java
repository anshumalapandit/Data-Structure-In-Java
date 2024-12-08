import java.io.*;
import java.util.*;

public class Solution {
    // kadane algorithm..
public static int maxSubarray(int arr[],int n){
    int maxsum=arr[0];
    int cursum=arr[0];
    for(int i=1;i<n;i++){
        if(cursum>=0){
            // it means positive element add it 
            cursum+=arr[i];
        }else{
            // negative - assign new value to it
            cursum=arr[i];
        }
        if(cursum>maxsum){
            maxsum=cursum;
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
