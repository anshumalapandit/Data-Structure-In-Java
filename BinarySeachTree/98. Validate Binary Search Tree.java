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
    public boolean helper(TreeNode root,TreeNode min,TreeNode max){
        // intiliayy both will null
        if(root==null){
            return true; // empty tree is also BST
        }
        if(min!=null && root.val<=min.val){
            // min ko min hona chahiye tha but nhi so false
            return false;
        }
        if(max!=null && root.val>=max.val){
            // max ko bada hona chahiye tha but nhi hai so false immediate
            return false;
        }
        // call same for left subtree and right subtree
        return helper(root.left,min,root) && helper(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
}
