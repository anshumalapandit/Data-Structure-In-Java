import java.io.*;
import java.util.*;

public class Solution {
public static void mergeTwoArr(int a[],int b[],int n,int m){
    int i=0;
    int j=0;
    int k=0;
    int ans[]=new int[n+m];
    while(i<n && j<m){
        if(a[i]<b[j]){
            ans[k++]=a[i++];
        }else{
            ans[k++]=b[j++];
        }
    }
    // now add remainig elemnt
    while(i<n){
        ans[k++]=a[i++];
    }
    while(j<m){
        ans[k++]=b[j++];
    }
    // now print it
    for(i=0;i<ans.length;i++){
        System.out.println(ans[i]);
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
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        mergeTwoArr(a,b,n,m);
    }
}
