class Solution {
    public void dfs(int vis[],int node, List<Integer> list,List<List<Integer>> adj,List<List<Integer>> ans){
        vis[node]=1;
        list.add(node);
        
        if(node == adj.size() - 1){
            // now no more path to go
            // its time too add
            ans.add(new ArrayList<>(list));
        }else {
        // now add its nbr
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                dfs(vis,nbr,list,adj,ans);
            }
        }
        }
        // during backtracking dont forget to mark it unvisited bcoz may be it will visit in next path.
       vis[node]=0;
       list.remove(list.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
       for(int i=0;i<graph.length;i++){
        for(int row:graph[i]){
            //i->row
            adj.get(i).add(row);
        }
       }
       List<Integer> list=new ArrayList<>();
       List<List<Integer>> ans=new ArrayList<>();
       int vis[]=new int[adj.size()];
       dfs(vis,0,list,adj,ans);
       return ans;
    }
}
