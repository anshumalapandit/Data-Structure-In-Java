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
    public TreeNode helper(int [] inorder ,int isi,int iei,int post[],int psi,int pei){
        if(isi>iei){
            return null;
        }
        // first make new Node of post(pei)
        TreeNode newNode=new TreeNode(post[pei]);
        // now find that nodes in inorder[]
        int idx=isi;
        while(inorder[idx]!=post[pei]){
            idx++;
        }
        int tn=idx-isi;
        newNode.left=helper(inorder,isi,idx-1,post,psi,psi+tn-1);
        newNode.right=helper(inorder,idx+1,iei,post,psi+tn,pei-1);
        return newNode;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
}
