
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
    static int ct;
    public static int findAvg(TreeNode tempRoot){
        if(tempRoot==null){
            return 0;
        }
        if(tempRoot.left==null && tempRoot.right==null){
            return tempRoot.val;
        }
        ct=0; // how many nodes in subtree
        int avg=getSum(tempRoot)/ct;
        return avg;
    }
    public static int getSum(TreeNode root){
        if(root==null){
            return 0;
        }
        ct++; // its tracking how many
        int leftSum=getSum(root.left);
        int rightSum=getSum(root.right);
        return leftSum+rightSum+root.val;
    }
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=0; // 
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curNode=q.poll();
                if(curNode.val==findAvg(curNode)){
                    count++;
                }
                if(curNode.left!=null ) q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);
            }
        }
        return count;
    }
}
