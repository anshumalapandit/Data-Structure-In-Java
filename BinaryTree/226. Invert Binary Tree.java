class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode leftPart=invertTree(root.left);
        TreeNode rightpart=invertTree(root.right);
        root.left=rightpart;
        root.right=leftPart;
        return root;
    }
}
