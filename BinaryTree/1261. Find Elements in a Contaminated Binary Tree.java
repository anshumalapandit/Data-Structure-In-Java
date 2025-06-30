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
class FindElements {
  TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
        createBT(this.root,0); // always call static function from constuctor
    }
    
    public boolean find(int target) {
        return helper(target,root);
    }
    public boolean helper(int target,TreeNode root){
        if(root==null){
            return false;
        }
        if (root == null) return false;
        if (root.val == target) return true;

        int rootVal=root.val;
        if(rootVal==target) return true;
       return  helper(target,root.left) || helper(target,root.right);
    }
    
    public static TreeNode createBT(TreeNode root,int value){
        if(root==null){
            return null;
        }
        int temp=root.val;
        root.val=value;
        int curRoot=root.val;
        root.left=root.left!=null? createBT(root.left,2*curRoot+1): null;
        root.right=root.right!=null? createBT(root.right,2*curRoot+2):null;
        return root;
    }

}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
