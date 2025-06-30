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
    public int sumEvenGrandparent(TreeNode root) {
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(cur.val%2==0){
                    // if even hai then only
                    if(cur.left!=null && cur.left.left!=null){
                        sum+=cur.left.left.val;
                    }
                    if(cur.left!=null && cur.left.right!=null){
                        sum+=cur.left.right.val;
                    }
                    if(cur.right!=null && cur.right.left!=null){
                        sum+=cur.right.left.val;
                    }
                     if(cur.right!=null && cur.right.right!=null){
                        sum+=cur.right.right.val;
                    }
                }
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
        }
        return sum;
    }
}
