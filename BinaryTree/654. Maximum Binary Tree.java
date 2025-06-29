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
    public int findMax(int num[],int si,int ei){
        int max=Integer.MIN_VALUE;
        int idx=si;
        for(int i=si;i<=ei;i++){
            if(num[i]>max){
                max=num[i];
                idx=i;
            }
        }
        return idx;
    }
    public TreeNode createMaxBT(int nums[],int si,int ei){
        if(si>ei ){
            return null;
        }
        int maxValIdx=findMax(nums,si,ei);
        TreeNode root=new TreeNode(nums[maxValIdx]);
        root.left=createMaxBT(nums,si,maxValIdx-1); // imp
        root.right=createMaxBT(nums,maxValIdx+1,ei); // imp
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
        return createMaxBT(nums,0,nums.length-1);
    }
}
