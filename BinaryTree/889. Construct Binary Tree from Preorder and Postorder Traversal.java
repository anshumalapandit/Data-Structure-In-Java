/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        for(int i=0;i<n;i++){
            map.put(postorder[i],i); // i am storing for fast lookup
        }
        return helper(0,n-1,0,n-1,preorder,postorder);
    }
    public TreeNode helper(int i1,int i2,int j1,int j2,int preorder[],int postorder[]){
        if(i1>i2 || j1>j2){
            return null;
        }
        // create root node
        TreeNode root=new TreeNode(preorder[i1]);
        // important edge cases // if dono mai single node hai return immediately 
        if(i1==i2){
            return root; 
        }
        // now finding next node in postorder 
        int r=map.get(preorder[i1+1]);
        int size=r-j1+1;
        root.left=helper(i1+1,i1+size,j1,r,preorder,postorder);
        root.right=helper(i1+size+1,i2,r+1,j2-1,preorder,postorder);
        return root;
    }
}
