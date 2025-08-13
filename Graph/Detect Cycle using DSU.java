class Solution {
    // Function to detect cycle using DSU in an undirected graph.
    class DSU{
        int par[];
        int rank[];
        DSU(int n){
            par=new int[n];
            rank=new int[n]; // initialise by default 0
            // need to initiliase par by itself
            for(int p=0;p<par.length;p++){
                par[p]=p;
            }
        }
        // find fxn
        public int find(int x){
            if(x==par[x]){
                return x;
            }
            return par[x]=find(par[x]);
        }
        // union fxn
        public boolean union(int a,int b){
            int parA=find(a);
            int parB=find(b);
            if(parA==parB){
                return true; // already connected
            }
            if(rank[parA]==rank[parB]){
                // if dono ka rank same hai to
                par[parA]=parB; //a->b
                // inc the rank by 1 of b
                rank[parB]++;
            }else if(rank[parA]<rank[parB]){
                par[parA]=parB;
            }else{
                par[parB]=parA;
            }
            return false;
        }
    }
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        DSU dsu=new DSU(V);
        for(int i=0;i<adj.size();i++){
            for(int node:adj.get(i)){
                int src=i;
                int dest=node;
                if(src<dest){
                    if(dsu.union(src,dest)){
                        return 1; // kisi point pr true return kiya cycle return immeditely
                    }else{
                        // union kardo
                        dsu.union(src,dest);
                    }
                }
            }
        }
         return 0;
    }
}
