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
    public int findHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=findHeight(root.left);
        int right=findHeight(root.right);
        return Math.max(left,right)+1;
    }
    public int helper(TreeNode root,int level,boolean flag[],int ht,int ans[]){
        if(root==null){
            return 0;
        }
        int left=helper(root.left,level+1,flag,ht,ans);
        int right=helper(root.right,level+1,flag,ht,ans);
        if(level==ht){
           // if it is my First left bottom then only return
           if(!flag[0]){
            flag[0]=true; // change it taki next naa aa paye
            // store the answer 
            ans[0]=root.val;
           }
        }
       return -1;
    }
    public int findBottomLeftValue(TreeNode root) {
        int ht=findHeight(root);
        boolean flag[]=new boolean[1];
        int ans[]=new int[1];
        helper(root,1,flag,ht,ans); // current level 0
        return ans[0];
    }
}
