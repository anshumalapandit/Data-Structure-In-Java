import java.io.*;
import java.util.*;

public class Solution {
public static int[][] matrixMul(int a[][],int r1,int c1,int b[][],int r2,int c2){
    int ans[][]=new int[r1][c2];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0;k<c1;k++){
                ans[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    return ans;
}
public static void print(int mat[][]){
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Invalid input");
        }else{
            int ans[][]=matrixMul(a,r1,c1,b,r2,c2);
            print(ans);
        }
    }
}
