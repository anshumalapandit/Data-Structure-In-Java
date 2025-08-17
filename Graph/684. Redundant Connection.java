class Solution {
    class DSU {
        int par[];
        int rank[];
        DSU(int n){
            // initliase parent + rank []
            rank=new int[n+1]; // by default 0 
            par=new int[n+1];
            for(int i=0;i<par.length;i++){
                par[i]=i;
            }
        }
        // find fxn
        public int find(int x){
            if(x==par[x]){
                return x;
            }
            return par[x]=find(par[x]);
        }
        // parent fxn
        public boolean union(int a,int b){
            int parA=find(a);
            int parB=find(b);
            if(parA==parB){
                return true; // already connected extra edges 
            }
            if(rank[parA]==rank[parB]){
                // a->b , update 2 things 
                par[parA]=parB;  //1. update parent of a
                // 2. inc the rank of b by 1
                rank[parB]++;
            }else if(rank[parA]<rank[parB]){
                // a->b
                par[parA]=parB;  //1. update parent of a
            }else{
                par[parB]=parA;
            }
            return false;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int ans[]=new int[2];
        int n=edges.length;
        DSU dsu=new DSU(n);
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            if(dsu.union(u,v)){
                // its extra edge 
                ans[0]=u;
                ans[1]=v;
            }else{
                dsu.union(u,v);
            }
        }
        return ans;
    }
}
