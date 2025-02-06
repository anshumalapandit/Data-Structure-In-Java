import java.io.*;
import java.util.*;

public class Solution {
public static void targetSumPair(int a[],int n,int tar){
    Arrays.sort(a);
    int i=0;
    int j=n-1;
    while(i<j){
        int sum=a[i]+a[j];
        if(sum<tar){
            i++;
        }else if(sum>tar){
            j--;
        }else{
            // mil gya target
            System.out.println(a[i]+" "+a[j]);
            i++; j--;
        }
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
        int tar=sc.nextInt();
        targetSumPair(a,n,tar);
    }
}
