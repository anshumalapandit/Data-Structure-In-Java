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
    public boolean isDelete(int value,int del[]){
       for(int d:del){
        if(d==value){
            return true;
        }
       }
       return false;
    }
    public TreeNode helper(TreeNode root,int del[],List<TreeNode> ans){
        if(root==null){
            return null;
        }
        // first call for its child then check for root is deleting or not
        root.left=helper(root.left,del,ans);
        root.right=helper(root.right,del,ans);
        // now check kya root node is deleteing node
        // if it is then i will add only its left + right child not itself
        if(isDelete(root.val,del)){
            if(root.left!=null) ans.add(root.left);
            if(root.right!=null) ans.add(root.right);
            // imp step=> return null why? bcoz node is deleted
            return null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans=new ArrayList<>();
        // imp step what about if we have to delete root itself
        if(!isDelete(root.val,to_delete)){
          ans.add(root);
        }
        helper(root,to_delete,ans); // here we are not adding root remember
        return ans;
    }
}
