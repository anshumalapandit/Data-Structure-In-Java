import java.io.*;
import java.util.*;

public class Solution {
public static void swapRow(int row,int a[][],int n){
    int last=n-1;
    for(int j=0;j<=n/2-1;j++){
        int temp=a[row][j];
        a[row][j]=a[row][last];
        a[row][last]=temp;
        last--;
    }
}
public static void rotate(int a[][],int n){
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            swap(a,i,j);
        }
        }
    for(int i=0;i<n;i++){
        swapRow(i,a,n);
    }
    
    }
    public static void swap(int a[][],int row,int col){
        int temp=a[row][col];
        a[row][col]=a[col][row];
        a[col][row]=temp;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        rotate(a,n);
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}
