import java.io.*;
import java.util.*;

public class Solution {
public static void setRow(int a[][],int row,int m){
    for(int j=0;j<m;j++){
        if(a[row][j]==0){
            a[row][j]=-1;
        }
    }
}
public static void setCol(int a[][],int col,int n){
    for(int i=0;i<n;i++){
        if(a[i][col]==0){
            a[i][col]=-1;
        }
    }
}
public static void modify(int a[][],int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][j]==1){
            setRow(a,i,m);
            setCol(a,j,n);
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][j]==-1){
                a[i][j]=1;
            }
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        modify(a,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
