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
    public void dfs(TreeNode root, HashMap<Integer,List<Integer>> map,int level,int parent){
        if(root==null){
            return ;
        }
        List<Integer>list =new ArrayList<>();
        list.add(level);
        list.add(parent);
        if(map.containsKey(root.val)==false)
        map.put(root.val,list);
        dfs(root.left,map,level+1,root.val);
        dfs(root.right,map,level+1,root.val);

    }
    public boolean helper(TreeNode root,int x,int y, HashMap<Integer,List<Integer>> map){
        List<Integer>list =new ArrayList<>();
        list.add(0,-1); // parent
        map.put(root.val,list);
         dfs(root,map,0,root.val); 
       List<Integer> list1=map.get(x);
       List<Integer> list2=map.get(y);
       // lets check same depth
       if(list1.get(0)==list2.get(0) && list1.get(1)!=list2.get(1)){
         return true;
       }
       return false;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer , List<Integer>> map=new HashMap<>();
        return helper(root,x,y,map);
    }
}
