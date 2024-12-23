class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void getInorder(Node root1,ArrayList<Integer> a1){
        if(root1==null){
            return;
        }
        getInorder(root1.left,a1);
        a1.add(root1.data);
        getInorder(root1.right,a1);
    }
    public void merge(ArrayList<Integer> ans,ArrayList<Integer> a1,ArrayList<Integer> a2){
        int i=0;
        int j=0;

        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<a2.get(j)){
                ans.add(a1.get(i));
                i++;
            }else{
                ans.add(a2.get(j));
                j++;
            }
        }
        // now add remaining elemnt
        while(i<a1.size()){
            ans.add(a1.get(i));
            i++;
        }
        while(j<a2.size()){
            ans.add(a2.get(j));
            j++;
        }
    }
    public void mergeBst(ArrayList<Integer> ans,int start,int end){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> a1=new ArrayList<>();
        getInorder(root1,a1);
        ArrayList<Integer> a2=new ArrayList<>();
        getInorder(root2,a2);
        ArrayList<Integer> ans=new ArrayList<>();
        merge(ans,a1,a2);
        return ans;
        // mergeBst(ans,0,ans.size()-1);
    }
}
