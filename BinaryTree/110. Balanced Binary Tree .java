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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int height=getHeight(root);
        return height!=-1;
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int lst=getHeight(root.left);
        int rst=getHeight(root.right);
        if(lst==-1 || rst==-1){
            return -1;
        }
        if(Math.abs(lst-rst)>1){
            return -1;
        }
        return 1+Math.max(lst,rst);
    }
}
