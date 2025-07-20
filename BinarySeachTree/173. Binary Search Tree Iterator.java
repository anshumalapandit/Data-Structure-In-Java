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
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    int i;
    public BSTIterator(TreeNode root) {
        getInorder(list,root);
        i=0;
    }
    
    public int next() {
        int ans=list.get(i);
        i++;
        return ans;
    }
    
    public boolean hasNext() {
        if(list.size()>i) return true;
        return false;
    }
    public void getInorder(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        getInorder(list,root.left);
        list.add(root.val);
        getInorder(list,root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
