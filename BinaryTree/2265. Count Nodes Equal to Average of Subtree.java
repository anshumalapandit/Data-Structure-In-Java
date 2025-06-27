
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
    static int ct;
    public static int findAvg(TreeNode tempRoot){
        if(tempRoot==null){
            return 0;
        }
        if(tempRoot.left==null && tempRoot.right==null){
            return tempRoot.val;
        }
        ct=0; // how many nodes in subtree
        int avg=getSum(tempRoot)/ct;
        return avg;
    }
    public static int getSum(TreeNode root){
        if(root==null){
            return 0;
        }
        ct++; // its tracking how many
        int leftSum=getSum(root.left);
        int rightSum=getSum(root.right);
        return leftSum+rightSum+root.val;
    }
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=0; // 
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curNode=q.poll();
                if(curNode.val==findAvg(curNode)){
                    count++;
                }
                if(curNode.left!=null ) q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);
            }
        }
        return count;
    }
}
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
    public int averageOfSubtree(TreeNode root) {
        int arr[] = new int[1]; //count
        dfs(root , arr);
        return arr[0];
    }

    public static List<Integer> dfs(TreeNode node , int arr[]){
        if (node == null){
            List <Integer> base = new ArrayList<>();
            return base;
        }
        List <Integer> left = dfs(node.left , arr); //8 , 0 , 1
        List <Integer> right = dfs(node.right , arr); //5 ,6
        List <Integer> list = new ArrayList<>(); //8 , 0 , 1 , 5 , 6 , 4
        addElements(left , list);
        addElements(right , list);
        list.add(node.val);
        int average = (int) sum(list)/list.size();
        if (average == node.val){
            arr[0] = arr[0] + 1;
        }
        return list;
    }
    public static void addElements(List <Integer> l , List <Integer> list){
        for (int i = 0 ; i < l.size() ; i++){
            list.add(l.get(i));
        }
    }
    public static int sum(List <Integer> list){
        int sum = 0;
        for (int i = 0 ; i < list.size() ; i++){
            sum += list.get(i);
        }
        return sum;
    }
}
