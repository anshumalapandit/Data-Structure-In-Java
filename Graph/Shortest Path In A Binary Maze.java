import java.io.*;
import java.util.*;

public class Solution {
public static class Triple{
    int row;
    int col;
    int dis;
    Triple(int row,int col,int dis){
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}
public static int shortPath(int mat[][],int n,int m,int srcRow,int srcCol,int destRow,int destCol){
    Queue<Triple> q=new LinkedList<>();
    int dist[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dist[i][j]=(int)(1e9);
        }
    }
    dist[srcRow][srcCol]=0;
    int dRow[]={-1,0,1,0};
    int dCol[]={0,-1,0,1};
    q.add(new Triple(srcRow,srcCol,0));
    while(q.size()>0){
        Triple cur=q.remove();
        int row=cur.row;
        int col=cur.col;
        int dis=cur.dis;
        
        for(int i=0;i<4;i++){
        int nRow=row+dRow[i];
        int nCol=col+dCol[i];
        if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && mat[nRow][nCol]==1 && dist[nRow][nCol]>dis+1){
            dist[nRow][nCol]=1+dis;
        
            if(nRow==destRow && nCol==destCol){
                return 1+dis; // also return dist[nRow][nCol];
            }
            q.add(new Triple(nRow,nCol,dist[nRow][nCol]));
        }
    }
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
        int srcR=sc.nextInt();
        int srcC=sc.nextInt();
        int destR=sc.nextInt();
        int destC=sc.nextInt();
        System.out.println(shortPath(mat,n,m,srcR,srcC,destR,destC));
    }
}
