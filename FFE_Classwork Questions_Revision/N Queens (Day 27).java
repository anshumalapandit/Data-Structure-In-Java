import java.io.*;
import java.util.*;

public class Solution {
public static boolean isSafePos(boolean arr[][],int row,int col){
    // d1
    for(int i=row-1,j=col-1;i>=0 && j>=0 ; i--,j--){
        if(arr[i][j]==true){
            return false;
        }
    }
    // d2
    for(int i=row-1;i>=0; i--){
        if(arr[i][col]==true){
            return false;
        }
    }
    // d3
    for(int i=row-1,j=col+1;i>=0 && j<arr.length; i--,j++){
        if(arr[i][j]==true){
            return false;
        }
    }
    return true;
}
public static void Nqueen(boolean arr[][],int row,String ans){
    if(arr.length==row){
        System.out.println(ans+".");
        return;
    }
    for(int col=0;col<arr.length;col++){
        if(isSafePos(arr,row,col)){
            arr[row][col]=true;
            Nqueen(arr,row+1,ans+row+"-"+col+", ");
            arr[row][col]=false; // for considering all others combinations
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean arr[][]=new boolean[n][n];
        Nqueen(arr,0,"");
    }
}
