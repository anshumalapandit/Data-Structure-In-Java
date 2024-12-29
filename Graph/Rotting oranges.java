import java.io.*;
import java.util.*;

public class Solution {
public static class Triple{
    int row;
    int col;
    int time;
    Triple(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
public static int rottenOranges(int mat[][],int n,int m){
    int count=0; // counter no. of fresh orange
     Queue<Triple> q=new LinkedList<>();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==1){
                count++;
            }else if(mat[i][j]==2){
                // add into queue
                q.add(new Triple(i,j,0));
            }
        }
    }
    int ans=0;
    int dr[]={-1,0,1,0};
    int dc[]={0,-1,0,1};
    while(q.size()>0){
        Triple node=q.remove();
        ans=Math.max(ans,node.time);
       for(int i=0;i<4;i++){
           // for each node search fresh mango all in 4 direction
           int nrow=node.row+dr[i];
           int ncol=node.col+dc[i];
           if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]==1){
               mat[nrow][ncol]=2; // mark it rotten
               q.add(new Triple(nrow,ncol,node.time+1));
               count--;
           }
       }
    }
    if(count==0){
        return ans; // all fresh oranges becomes rotten
    }
    return -1;
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
        System.out.println(rottenOranges(mat,n,m));
    }
}
