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
    public void helper(TreeNode root, String arr[]) {
        arr[0] += root.val + "";
        if (root.left == null && root.right != null) {
            arr[0] += "()"; // must show empty left child
        }
        if (root.left != null) {
            arr[0] += "(";
            helper(root.left, arr);
            arr[0] += ")";
        }
        if (root.right != null) {
            arr[0] += "(";
            helper(root.right, arr);
            arr[0] += ")";
        }

    }

    public String tree2str(TreeNode root) {
        String arr[] = new String[1];
        arr[0] = ""; // imp step by default null rehta hai
        helper(root, arr);
        return arr[0];
    }
}
