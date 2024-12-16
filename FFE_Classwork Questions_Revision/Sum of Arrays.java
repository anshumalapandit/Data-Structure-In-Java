import java.io.*;
import java.util.*;

public class Solution {
public static void sumOfArray(int a1[],int n1,int a2[],int n2){
    // take maximum n
    int n=Math.max(n1,n2)+1;
    int ans[]=new int[n];
    // pointers required 
    int i=n1-1,j=n2-1,carry=0,k=ans.length-1;
    while(i>=0 || j>=0){
        int sum=carry;
        if(i>=0){
            sum+=a1[i];
            i--;
        }
        if(j>=0){
            sum+=a2[j];
            j--;
        }
        ans[k]=sum%10;
        carry=sum/10;
        k--;
    }
    ans[k]=carry;
    // removed leading zeroes
    i=0;
    while(i<n && ans[i]==0){
        i++;
    }
    // what if my ans arr looks like 0000 so in such case print only single zero
    if(i==n){
        System.out.println(0);
    }
    while(i<n){
        System.out.println(ans[i]);
        i++;
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        sumOfArray(a1,n1,a2,n2);
    }
}
