public class Solution{
public int helper(TreeNode root, int sum) {
        if (root == null) return sum;

        // Go to right subtree first and update sum
        sum = helper(root.right, sum);

        // Add sum to current node
        root.val += sum;

        // Update sum to current node value
        sum = root.val; // 21 

        // Now go to left subtree with updated sum
        return helper(root.left, sum); 
    }
    public TreeNode convertBST(TreeNode root) {
        helper(root,0);
        return root;
    }
}
