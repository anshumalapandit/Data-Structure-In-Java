// Time Complexity Analysis
//The time complexity is O(h), where h is the height of the tree.
//In a balanced BST, this will be O(log n), but in a skewed tree, it could be O(n).
//The space complexity is O(h) due to the recursive call stack, where h is the height of the tree.
public static Node searchBST(Node root, int val) {
    if(root==null){
        return null;
    }
      if(root.data==val){
          return root;
      }
      if(root.data>val){
          return searchBST(root.left,val);
      }else{
          return searchBST(root.right,val);
      }

  }
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
// if u told to return subtree of that root:
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(val==root.val){
            // return subtree rooted with that node
            return root;
            
        }
        if(val<root.val){
            // go to left
            return searchBST(root.left,val);
        }else if(val>root.val){
            return searchBST(root.right,val);
        }
        return root;
    }
}
