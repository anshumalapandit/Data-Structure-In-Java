import java.io.*;
import java.util.*;

public class Solution {
public static void tss(int a[],int idx,int sof,int tar,String ans){
    if(idx==a.length){
        if(sof==tar){ // sum of far== target
            System.out.println(ans+".");
        }
        return;
    }
    tss(a,idx+1,sof+a[idx],tar,ans+a[idx]+", "); // part of an answer
    tss(a,idx+1,sof,tar,ans); // not part of an answer
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
        tss(a,0,0,tar,"");
    }
}
