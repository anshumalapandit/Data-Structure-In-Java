import java.io.*;
import java.util.*;

public class Solution {
public static boolean isPalin(int mat[][],int row,int n,int m){
    int start=0;
    int end=m-1;
    while(start<end){
      if(mat[row][start]!=mat[row][end]){
          return false;
      }
    start++;
        end--;
    }
    return true;
    
}
public static int countPalindrone(int mat[][],int n,int m){
    int count=0;
    for(int i=0;i<n;i++){
        if(isPalin(mat,i,n,m)){
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(countPalindrone(mat,n,m));
    }
}
