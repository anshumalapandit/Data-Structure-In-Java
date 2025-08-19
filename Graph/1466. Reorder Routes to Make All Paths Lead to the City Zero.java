class Solution {
    public void dfs(int node,int vis[],int ans[],List<List<int[]>> adj){
        vis[node]=1;
        for(int nbrs[]:adj.get(node)){
          int nbr=nbrs[0];
          int direction=nbrs[1];
          if(vis[nbr]==0){
             // add direction to our ans
          ans[0]+=direction;
             dfs(nbr,vis,ans,adj);
          }
        }
    }
    public int minReorder(int n, int[][] connections) {
        List<List<int []>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:connections){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(new int[]{v,1}); // orihinal edge =indicated with 1 (one);
            adj.get(v).add(new int[]{u,0}); 
        }
      int vis[]=new int[n];
      int ans[]=new int[1];
      dfs(0,vis,ans,adj);
      return ans[0];
    }
}
