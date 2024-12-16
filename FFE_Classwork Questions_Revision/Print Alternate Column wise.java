import java.io.*;
import java.util.*;

public class Solution {
public static void print(int a[][],int n,int m){
    for(int j=0;j<m;j++){
        if(j%2==0){
        for(int i=0;i<n;i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        print(a,rows,cols);
    }
}
