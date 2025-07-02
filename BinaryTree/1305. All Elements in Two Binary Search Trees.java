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
    public static void getInorder(ArrayList<Integer> arr,TreeNode root){
        if(root==null){
            return;
        }
        getInorder(arr,root.left);
        arr.add(root.val);
        getInorder(arr,root.right);
    }
    public static void merge(ArrayList<Integer> list1,List<Integer> list2,List<Integer> ans){
         int i=0,j=0;
         int n=list1.size()-1;
         int m=list2.size()-1;
        
         while(i<=n && j<=m){
            if(list1.get(i)<list2.get(j)){
                ans.add(list1.get(i));
                i++; 
            }else{
                ans.add(list2.get(j));
                j++;
            } 
         }
         // now add remaining elements
         while(i<=n){
            ans.add(list1.get(i));
            i++;
         }
         while(j<=m){
            ans.add(list2.get(j));
            j++;
         }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        getInorder(list1,root1);
        getInorder(list2,root2);
        if(list1.size()==0){
            return list2;
        }
        if(list2.size()==0){
            return list1;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        merge(list1,list2,ans);
        return ans;
    }
}
