import java.io.*;
import java.util.*;

public class Solution {
public static void chart(int a[],int n){
   // int row= need to find row is maximum element of array
    int col=n;
    int row=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(a[i]>row){
            row=a[i];
        }
    }
    for(int i=row;i>=1;i--){
        for(int j=0;j<col;j++){
            if(i>a[j]){
                // carefully print 2 spaces 1 spaces + 1 space extra for betwwen 2 elem wala space
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
            }
            System.out.println();
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
        chart(a,n);
    }
}
