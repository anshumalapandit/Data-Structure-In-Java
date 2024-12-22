class Solution {
public class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
    public void bfs(int row, int col, char[][] grid, int vis[][]) {
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};
        vis[row][col]=1;
    Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        while(q.size()>0){
            Pair cur=q.remove();
            for(int d=0;d<4;d++){
                int nrow=cur.row+dr[d];
                int ncol=cur.col+dc[d];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        int count = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1')  {
                    count+=1;
                    bfs(i,j,grid,vis);
                }
            }
        }

        return count;
        
    }
}
