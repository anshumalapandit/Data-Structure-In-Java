class Solution {
    public boolean dfs(int vis[],List<List<Integer>> adj,int src,int dest){
        if(src==dest){ // if node == dest reached yahuu
            return true;
        }
        // first i will mark the node as visited
        vis[src]=1;
        // then i will ask my nbr hey u r reachable
        for(int nbr:adj.get(src)){
            if(vis[nbr]==0){
                if(dfs(vis,adj,nbr,dest)){
                    return true;
                    // every time your nbr will become is your source
                    // bcoz u r telling ur nbr if path exist from there means from u..
                }
            }
        }
        return false;

    }
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        // lets convert first matrix into list
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int s=edge[0];
            int d=edge[1];
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        int vis[]=new int[n]; // given that it is 0 based node
        // for(int i=0;i<n;i++){
        //     if(vis[i]==0){
        //         if(dfs(i,vis,adj,src,dest)){
        //             return true;
        //         }
        //     }
        // }
        // no need to call for any node if its in multiple componets its clear that no path
        // start from source only
        if(dfs(vis,adj,src,dest)){
            return true;
        }
        return false;
    }
}
