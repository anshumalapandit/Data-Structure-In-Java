/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node dfs(Node node,Map<Node,Node> map){
         // if node map mai pehle se present hai return krdo

         if(map.containsKey(node)){
            return map.get(node); 
         }
         // if not present hai then create kro
         // Node clone =node ; // shallow 
         Node clone=new Node(node.val); // object bew
         // put in map
         map.put(node,clone); // given node == clone node mapping
         // add all its nbr too
         // 1 - 2,3 , 1 - { }
         for(Node nbr:node.neighbors){
            clone.neighbors.add(dfs(nbr,map));
         }
         return clone;
    }
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node,Node> map=new HashMap<>();
        return dfs(node,map);
    }
}
