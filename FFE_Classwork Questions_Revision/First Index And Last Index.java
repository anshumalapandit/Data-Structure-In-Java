import java.io.*;
import java.util.*;

public class Solution {
public static void findIndex(int a[],int n,int target){
    int first=-1;
    int last=-1;
    for(int i=0;i<n;i++){
        if(a[i]==target){
            if(first==-1){
                first=i;
            }
            // here dont use else coz If the target appears only once, last remains -1. To handle this. remove else bracket so that both first and last index would remain same..
                last=i;
        }
    }
    System.out.println(first);
    System.out.println(last);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        findIndex(a,n,target);
    }
}
