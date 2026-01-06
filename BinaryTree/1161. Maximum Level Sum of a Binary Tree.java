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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        int level=1;
        int ans=1; // smallest level 
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int curSum=0;
            for(int i=0;i<size;i++){
                // remove it and store it otherwise u will lose its references
                TreeNode CurNode=q.poll();
                curSum+=CurNode.val;
            if(CurNode.left!=null){
                q.add(CurNode.left);
            }
            if(CurNode.right!=null){
                q.add(CurNode.right);
            }
            }
            // after each level
            // calculate ans
            if(curSum>max){
                max=curSum;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}
