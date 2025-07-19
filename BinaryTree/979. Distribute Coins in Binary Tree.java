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
    public int helper(TreeNode root,int move[]){
        if (root == null) return 0;
       int left_balance=helper(root.left,move);
        int right_balance=helper(root.right,move);

        move[0]+=Math.abs(left_balance)+Math.abs(right_balance);
        
        // calculate current balance of root
        int balance=root.val+left_balance+right_balance-1;
        return balance;

    }
    public int distributeCoins(TreeNode root) {
        int move[]=new int[1];
        helper(root,move);
        return move[0];
    }
}
