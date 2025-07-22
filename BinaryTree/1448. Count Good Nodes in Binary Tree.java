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
    public boolean isGoodNode(List<Integer> path){
        // i need to check is any node greater then current X
        // i know my current X will be stored at last idx of arraylist
        int X=path.get(path.size()-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<path.size();i++){
            // -1? bcoz if same nodes are there so it will create confision ..if koi or node bada hai then only consider
            max=Math.max(path.get(i),max);
            }
        
        if(X!=max) return false;
        return true;
    }
    public void helper(TreeNode root,int ans[], List<Integer> path){
       if(root==null){
        return;
       }
       // is any node greater than X
       path.add(root.val);
       if(isGoodNode(path)){
         ans[0]++;
       }
       helper(root.left,ans,path);
       helper(root.right,ans,path);
       // during back tracking i will remove last node
       path.remove(path.size()-1);
    }
    public int goodNodes(TreeNode root) {
        int ans[]=new int[1];
        List<Integer> path=new ArrayList<>();
         helper(root,ans,path);
        return ans[0];
    }
}
