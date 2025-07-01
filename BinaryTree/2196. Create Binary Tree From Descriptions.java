// Brute force=TLE error=0(n square)
class Solution {
    private TreeNode root = null;

    public TreeNode createBinaryTree(int[][] descriptions) {
        List<TreeNode> nodes = new ArrayList<>();

        for (int[] d : descriptions) {
            int parent = d[0], child = d[1], isLeft = d[2];

            TreeNode parentNode = getOrCreate(nodes, parent);
            TreeNode childNode = getOrCreate(nodes, child);

            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        }

        // Find node that is never a child
        for (TreeNode node : nodes) {
            if (!isChild(node, descriptions)) {
                return node;
            }
        }

        return null;
    }

    private TreeNode getOrCreate(List<TreeNode> nodes, int val) {
        for (TreeNode node : nodes) {
            if (node.val == val) return node;
        }
        TreeNode newNode = new TreeNode(val);
        nodes.add(newNode);
        return newNode;
    }

    private boolean isChild(TreeNode node, int[][] descriptions) {
        for (int[] d : descriptions) {
            if (d[1] == node.val) return true;
        }
        return false;
    }
}
// optimised approach=0(n)
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int d[]:descriptions){
            int parent=d[0];
            int child=d[1];
            int isLeft=d[2];
              // Create parent,child  if not exists
            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));
            if(isLeft==1){
                map.get(parent).left=map.get(child);
                // i already create child node in line 26 so i wont create now
                // i will just take from map its node and attached here
            }else{
                map.get(parent).right=map.get(child);
            }
            // tracking child for getting answer 
            set.add(child); 
        }
        for(int key:map.keySet()){
            if(!set.contains(key)){
                // ye child set mai exist nhi karta means this is kisi ka child nhi hai
                // only parent hai jiska koi parent nhi
                // root node definity
                return map.get(key);
            }
        }
        return null; // fallBack
    }
}
