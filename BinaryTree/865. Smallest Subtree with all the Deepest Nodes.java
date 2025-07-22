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
    TreeNode ans=null; // declaring gobally
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int maxDepth[]=new int[1];
        maxDepth[0]= -1; // we are initilaising with -1
        postOrder(root,0,maxDepth); // current depth=0;
        return ans;
    }
    public int postOrder(TreeNode root,int depth,int maxDepth[]){
       if(root==null){
        return depth; //whatever the depth till now i will return from here
       }
       int left=postOrder(root.left,depth+1,maxDepth);
       int right=postOrder(root.right,depth+1,maxDepth);
       if(left==right){
        // if both heights are equal its means i reached to my deepest node
        // lets update my maxDepth
        maxDepth[0]=Math.max(maxDepth[0],left); //any left,right, this line may update maxDepth or may not.
        // if sach mai update hua hai to hi store kro answer mai root ko otherwise no
        if(maxDepth[0]==left){
            // maxDepth left k barabar means sach mai update hua hai
            ans=root;  // store the root;
        }
       }
       // return maximum depth
       return Math.max(left,right);
    }
}
