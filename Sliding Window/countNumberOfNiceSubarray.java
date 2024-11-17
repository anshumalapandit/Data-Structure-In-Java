// approach => atmost(k)-atmost(k-1) T.C=0(N) S.C=> 0(1)
import java.io.*;
import java.util.*;

public class Solution {
public static int atmostk(int arr[],int n,int k){
    int i=0,ans=0;
    for(int j=0;j<n;j++){
        k-=arr[j]%2;
        while(k<0){
            k+=arr[i]%2;
            i++;
        }
        ans=ans+(j-i+1);
    }
    return ans;
}
public static int countNiceSubarray(int arr[],int n,int k){
    int ans1=atmostk(arr,n,k);
    int ans2=atmostk(arr,n,k-1);
    return ans1-ans2;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(countNiceSubarray(arr,n,k));
    }
}
