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
    public TreeNode helper(int [] inorder ,int isi,int iei,int post[],int psi,int pei){
        if(isi>iei){
            return null;
        }
        // first make new Node of post(pei)
        // while making BT from inorder and preorder we take node of pre , coz root node pehle rehta hai same here taking from postorder, last 
        TreeNode newNode=new TreeNode(post[pei]);
        // now find that nodes in inorder[]
        int idx=isi; // imp dont ever take 0 here , idx start hoga inorder k starting idx se
        while(inorder[idx]!=post[pei]){
            idx++;
        }
        int tn=idx-isi; // total nodes kitne honge ek subtree mai => jaha pe hum pahuche - jaha se start kiye the => idx-isi
        newNode.left=helper(inorder,isi,idx-1,post,psi,psi+tn-1); //left => starting idx stays same isi,psi. , ending => idx-1 yha tak jana hai psi+tn-1
        // psi+tn-1 => -1 bcoz last ek node ka already root node ban gya waha tak nhi jana hai .
        newNode.right=helper(inorder,idx+1,iei,post,psi+tn,pei-1); //right => ending idx stays same , iei,pei-1 as last node already included
        // idx-1 , idx+1 yaha pe swap => in a same way jese construct BT from inorder and pre mai .
        return newNode;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
}
