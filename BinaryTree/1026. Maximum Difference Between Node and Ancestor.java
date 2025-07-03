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
    public int findMax(TreeNode root,int min,int max){
        if(root==null) {
            // its means we reached to leaf node 
            return Math.abs(min-max);
        }
        // update min and max
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        int left=findMax(root.left,min,max);
        int right=findMax(root.right,min,max);
        return Math.max(left,right);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        return findMax(root,root.val,root.val);
    }
}
