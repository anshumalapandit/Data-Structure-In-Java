class Solution
{   
    public static void helper(ArrayList<Integer> ans,Node root,int low,int high){
        if(root==null){
            return;
        }
        if(root.data>=low && root.data<=high){
            helper(ans,root.left,low,high);
            ans.add(root.data);
            helper(ans,root.right,low,high);
        }
        if(root.data<low){
            helper(ans,root.right,low,high);
        }else if(root.data>high){
            helper(ans,root.left,low,high);
        }
    }
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer> ans=new ArrayList<>();
        helper(ans,root,low,high);
        return ans;
}
}
