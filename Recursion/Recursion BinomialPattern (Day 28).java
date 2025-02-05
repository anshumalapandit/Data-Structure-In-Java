import java.io.*;
import java.util.*;

public class Solution {
public static void bp(int n,int arr[][]){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if(j==0 || i==j){
                arr[i][j]=1;
            }else{
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
    }
    // print
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]!=0){
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        bp(n,arr);
    }
}
