/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public boolean allNodeSame(int grid[][],int x,int y,int n){
         int val = grid[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != val) {
                    return false;
                }
            }
        }    
        return true;
    }
    public Node solve(int grid[][],int x,int y,int n){
        if(allNodeSame(grid,x,y,n)){
            return new Node(grid[x][y]==1,true);
        }else{
            Node node=new Node(true,false); // here we can set any value
            node.topLeft=solve(grid,x,y,n/2);
            node.topRight=solve(grid,x,y+n/2,n/2);
            node.bottomLeft=solve(grid,x+n/2,y,n/2);
            node.bottomRight=solve(grid,x+n/2,y+n/2,n/2);
            return node;
        }

    }
    public Node construct(int[][] grid) {
        return solve(grid,0,0,grid.length);
    }
}
