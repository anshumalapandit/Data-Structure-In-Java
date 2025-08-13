class Solution {
    class DSU{
        int par[];
        int rank[];
        DSU(){
            par=new int[26];
            for(int i=0;i<26;i++){
                par[i]=i;
            }
            rank=new int[26];
        }
        // find fxn
        public int find(int x){
            if(x==par[x]){
                return x;
            }
            return par[x]=find(par[x]);
        }
        // union fxn
        public void union(int a,int b){
            int parA=find(a);
            int parB=find(b);
            if(parA==parB) return;
            if(rank[parA]==rank[parB]){
                par[parA]=parB;
                rank[parB]++;
            }else if(rank[parA]<rank[parB]){
                par[parA]=parB;
            }else{
                par[parB]=parA;
            }
        }
    }
    public boolean equationsPossible(String[] equations) {
        DSU dsu=new DSU();
        // 1st pass: union all '==' pairs
        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                int u = eq.charAt(0) - 'a';
                int v = eq.charAt(3) - 'a';
                dsu.union(u, v);
            }
        }

        // 2nd pass: check all '!=' pairs
        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                int u = eq.charAt(0) - 'a';
                int v = eq.charAt(3) - 'a';
                if (dsu.find(u) == dsu.find(v)) {
                    return false;  // conflict found
                }
            }
        }
        return true;
    }
}
