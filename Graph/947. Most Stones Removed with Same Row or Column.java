class Solution {
    public void dfs(int stones[][],int vis[],int idx){
        vis[idx]=1;
        // now we will check iske row col value kiske sath match hori
        for(int i=0;i<stones.length;i++){
            // this i giving me row value
            // we will ask only them jo unvisited hai
            if(vis[i]==0){
                // col fixed hai bcoz we have only 2 coordinates
                // agar mujhe same column mai check karna hai :column remains same , row change
                // same row mai chcek karna hai to row remain same but cloumn change
                if(stones[idx][0]==stones[i][0] || stones[idx][1]==stones[i][1]){
                    dfs(stones,vis,i);
                }
            }
        }
    }

    public int removeStones(int[][] stones) {
        // formula= totalStones-totalComponents
        int totalStones=stones.length;
        int vis[]=new int[totalStones];
        int components=0;
        for(int i=0;i<stones.length;i++){
            if(vis[i]==0){
                dfs(stones,vis,i);
                components++;
            }
        }
        return totalStones-components;
    }
}
