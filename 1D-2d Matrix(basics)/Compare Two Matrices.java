import java.io.*;
import java.util.*;

public class Solution {
public static void check(int mat1[][],int mat2[][]){
    for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[0].length;j++){
            if(mat1[i][j]!=mat2[i][j]){
                System.out.println("Not Same");
                break;
            }
               
        }
        
    }
     System.out.println("Same");
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int mat1[][]=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int mat2[][]=new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            mat2[i][j]=sc.nextInt();
        }
    }if(r1==r2 && c1==c2){
    check(mat1,mat2);
    }else{
        System.out.println("Not Same");
    }
}
}
