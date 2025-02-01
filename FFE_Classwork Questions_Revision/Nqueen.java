import java.io.*;
import java.util.*;

public class Solution {
public static boolean isQueenAttacking(int a[][],int r,int c,int n){
    // before cell
    for(int j=0;j<c;j++){
        if(a[r][j]==1){
            return true;
        }
    }
    // after cell
    for(int j=c+1;j<n;j++){
        if(a[r][j]==1){
            return true;
        }
    }
    // cell upper
    for(int i=0;i<r;i++){
        if(a[i][c]==1){
            return true;
        }
    }
    // cell k below
    for(int i=r+1;i<n;i++){
        if(a[i][c]==1){
            return true;
        }
    }
    // digonal up
    for(int i=0,j=0;i<r && j<c;i++,j++){
        if(a[i][j]==1){
            return true;
        }
    }
    // diagonal down
    for(int i=r+1,j=c+1;i<n && j<n;i++,j++){
        if(a[i][j]==1){
            return true;
        }
    }
    // antidiagonal up
    for(int i=0,j=n-1;i<r && j>c;i++,j--){
        if(a[i][j]==1){
            return true;
        }
    }
    // down
    for(int i=r+1,j=c-1;i<n && j>=0;i++,j--){
        if(a[i][j]==1){
            return true;
        }
    }
    return false;
}
public static String Nqueen(int a[][],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]==1){
                if(isQueenAttacking(a,i,j,n)==true){
                    return "Danger";
                }
            }
        }
    }
    return "N Queens";
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
        System.out.println(Nqueen(a,n));
    }
}
