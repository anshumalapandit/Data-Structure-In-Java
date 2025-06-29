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
    public int deepestLeavesSum(TreeNode root) {
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
           List<Integer> list=new ArrayList<>();
            boolean islast=true;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                // condition for checking deepest leaf node
                if(cur.left==null && cur.right==null){
                   list.add(cur.val);
                }else{
                    islast=false;
                }
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
                if(islast==true){
                  for(int i=0;i<list.size();i++){
                    sum+=list.get(i);
                }
            }
        }
        return sum;
    }
}
