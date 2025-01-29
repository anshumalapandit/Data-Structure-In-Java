import java.io.*;
import java.util.*;

public class Solution {
public static void printPattern(int a[][],int n,int m){
    int j=0;
    while(j<m){
        if(j%2==0){
            for(int i=0;i<n;i++){
                System.out.println(a[i][j]);
            }
        }else{
            for(int i=n-1;i>=0;i--){
                System.out.println(a[i][j]);
            }
        }
        j++;
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
        printPattern(a,n,m);
    }
}
