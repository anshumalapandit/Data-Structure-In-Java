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
    public TreeNode helper(int inorder[],int ins,int ine,int preorder[],int prs,int pre){
        if(ins>ine){
            return null;
        }
        TreeNode newNode=new TreeNode(preorder[prs]);
        // find that node in inorder
        int idx=ins;
        while(inorder[idx]!=preorder[prs]){
            idx++;
        }
        int tn=idx-ins;
        newNode.left=helper(inorder,ins,idx-1,preorder,prs+1,pre+tn);
        newNode.right=helper(inorder,idx+1,ine,preorder,prs+tn+1,pre);
        return newNode;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        int m=preorder.length;
        return helper(inorder,0,n-1,preorder,0,m-1);
    }
}
