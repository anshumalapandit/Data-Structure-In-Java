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
    public void getSortedSeq(ArrayList<Integer> sortedSeq,TreeNode root){
        if(root==null){
            return;
        }
        getSortedSeq(sortedSeq,root.left);
        sortedSeq.add(root.val);
        getSortedSeq(sortedSeq,root.right);
    }
    public TreeNode helper(ArrayList<Integer> sortedSeq,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(sortedSeq.get(mid));
        // 0 to mid-1
      node.left=  helper(sortedSeq,start,mid-1);
       node.right= helper(sortedSeq,mid+1,end);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> sortedSeq=new ArrayList<>();
        getSortedSeq(sortedSeq,root);
        root=helper(sortedSeq,0,sortedSeq.size()-1);
        return root;
    }
}
