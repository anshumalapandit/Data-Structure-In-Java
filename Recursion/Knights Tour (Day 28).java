import java.io.*;
import java.util.*;

public class Solution {
public static void displayCB(int cb[][]){
    for(int i=0;i<cb.length;i++){
        for(int j=0;j<cb.length;j++){
            System.out.print(cb[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}
public static void kt(int cb[][],int r,int c,int steps){
    if(r<0 || c<0 || r>=cb.length || c>=cb.length || cb[r][c]>0){
        return ;
    }
    // for positive base cases
    if(steps==cb.length*cb.length){
        cb[r][c]=steps;
        // before resetting just print it
        displayCB(cb);
        cb[r][c]=0; // keep it blank for next possible moves
        return;
    }
    cb[r][c]=steps;
    // now call for moving rest 8 direction coz possible move of knights is 8
    kt(cb,r-2,c+1,steps+1);
    kt(cb,r-1,c+2,steps+1);
    kt(cb,r+1,c+2,steps+1);
    kt(cb,r+2,c+1,steps+1);
    kt(cb,r+2,c-1,steps+1);
    kt(cb,r+1,c-2,steps+1);
    kt(cb,r-1,c-2,steps+1);
    kt(cb,r-2,c-1,steps+1);
    // for considering all possible moves
    cb[r][c]=0;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int cb[][]=new int[n][n];
        kt(cb,r,c,1);
    }
}
