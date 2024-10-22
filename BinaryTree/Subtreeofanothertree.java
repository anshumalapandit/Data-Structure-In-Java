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
    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null){
            return false;
        }
        // now i will check is my left subtree identical or not
        // if(!isIdentical(root.left,subRoot.left)){
        //     return false;
        // }
        // if(!isIdentical(root.right,subRoot.right)){
        //     return false;
        // }
      // also u can check curr node + recursively left and right node
        return root.val==subRoot.val && isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.val);
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(subRoot==null){
            return true;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
