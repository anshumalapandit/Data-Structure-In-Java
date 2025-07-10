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
    public int find(TreeNode root){
        // why u r not calling recur not needed its says clearly i have only 3 nodes in my BT
        int leftVal=root.left.val;
        int rightVal=root.right.val;
        return leftVal+rightVal;
    }
    public boolean checkTree(TreeNode root) {
        int rootVal=root.val;
        int childSum=find(root);
        if(rootVal==childSum){
            return true;
        }
        return false;
    }
}
