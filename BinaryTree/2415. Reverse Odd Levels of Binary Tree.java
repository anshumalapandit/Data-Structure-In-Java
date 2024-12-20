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
    public void helper(TreeNode left,TreeNode right,int level){
    
        if(left==null || right==null) return;
        if(level%2==0){
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
            // root.left =root.right!=null? root.right :null;
            // root.right =root.left!=null ? root.left: null;
        }
    helper(left.left,right.right,level+1);
    helper(left.right,right.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left,root.right,0);
        return root;
    }
}
