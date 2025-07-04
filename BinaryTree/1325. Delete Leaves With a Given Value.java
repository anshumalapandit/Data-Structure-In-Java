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
    public TreeNode dfs(TreeNode root,int target){
        if(root==null){
            return root;
        }
        root.left=dfs(root.left,target);
        root.right=dfs(root.right,target);
        // imp = check after recursion
        //Remove all leaf nodes whose value is equal to the target.
       //But also — if a node becomes a leaf after removing its children,and its target
       // remov that too
        if(root.left==null && root.right==null && root.val==target){
            root=null; // here we can also return direct return root;
            return root;
        }
    
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
     return dfs(root,target);
    }
}
