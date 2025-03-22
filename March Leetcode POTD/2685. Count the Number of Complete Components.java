class Solution {
    boolean flag;
    int nodeCount, edgeCount;
    public void dfs(List<List<Integer>> graph,int n,int vis[],int node){
        vis[node]=1;
         nodeCount++;
         edgeCount+=graph.get(node).size();
        // i want to calculate node in each component also calculate edges
        // then check for its nbr
       for(int nbr:graph.get(node)){
        if(vis[nbr]==0){
            dfs(graph,n,vis,nbr);
        }
       }
    }
    public int find(List<List<Integer>> graph,int n){
         int vis[]=new int[n];
         int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                nodeCount=0;
                edgeCount=0;
                dfs(graph,n,vis,i);
                 // Each edge is counted twice (once for each node)
                if (edgeCount / 2 == (nodeCount * (nodeCount - 1)) / 2) {
                    ///2 is necessary because in an undirected graph, each edge is stored twice in the adjacency list (once for each node it connects).
                    count++; // It's a complete component
                }
            }
        }
        return count;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        // find all complete connected component
      // first create adjency list
       List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
          graph.add(new ArrayList<>()); // imp step of iniliatiztaion
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        int ans=find(graph,n);
        return ans;
    }
}
