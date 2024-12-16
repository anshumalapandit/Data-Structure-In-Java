import java.io.*;
import java.util.*;

public class Solution {
 public static void print_alternate_rows(int arr2d[][]){
     for(int i=0;i<arr2d.length;i++){
         if(i%2==0){
         for(int j=0;j<arr2d[0].length;j++){
         System.out.print(arr2d[i][j]+" ");
     }
             System.out.println();
         }
       //System.out.println();
     }
     
 }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr2d[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        print_alternate_rows(arr2d);
        
    }
}
