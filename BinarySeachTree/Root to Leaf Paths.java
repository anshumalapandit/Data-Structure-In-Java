class Solution {
    public static void helper(Node root,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            arr.add(new ArrayList<>(path));
        }
        helper(root.left,arr,path);
        helper(root.right,arr,path);
        path.remove(path.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        // intilise
        ArrayList<Integer> path=new ArrayList<>();
       helper(root,arr,path);
     return arr;  
    }
}
