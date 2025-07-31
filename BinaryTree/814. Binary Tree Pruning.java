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
    public TreeNode helper(TreeNode root){
        if(root==null){
            return null;
        }
        // i want to delete subtree which contains 0 
        root.left=helper(root.left);
        root.right=helper(root.right);
        // now i am at the leaf node
        // why we are checking leaf condition- bcoz if we wont check we will lead to delete every 0 node either
        // it contains 1 or not in its child ,
        // remmerber if want to delete only that subtree which contains all nodes 0 .
        if(root.left==null && root.right==null && root.val==0){
            // its contains 0 so delete it
            return null;
        }
        // otherwise delete it
        return root;
    }
    public TreeNode pruneTree(TreeNode root) {
        return helper(root);
    }
}
