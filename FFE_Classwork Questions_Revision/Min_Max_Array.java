import java.io.*;
import java.util.*;

public class Solution {
public static int findSpan(int a[],int n){
    // find maximum
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    //find max;
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    // find min
    for(int i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    int ans=max-min;
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(findSpan(a,n));
    }
}
