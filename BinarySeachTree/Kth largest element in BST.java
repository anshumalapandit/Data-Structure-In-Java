import java.util.*;
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
     ArrayList<Integer> ans=inorder(root);
     ans.reverse();
     return ans.get(k-1);
     
    }
    public ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        ans.addAll(inorder(root.left));
        ans.add(root.data);
        ans.addAll(inorder(root.right));
        return ans;
    }
}
