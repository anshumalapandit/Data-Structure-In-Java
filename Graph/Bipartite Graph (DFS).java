 public static boolean dfs(int node,List<List<Integer>> graph,int color[]){

        for(int nbr : graph.get(node)){
            if(color[nbr]==-1){
                color[nbr]=1-color[node];
            if(!dfs(nbr,graph,color)){
                return false;
            }
            }else if(color[node]==color[nbr]){
                return false;
            }
        }
        return true;
    }
public static boolean isBipartite(List<List<Integer>> graph,int n){
    int color[]=new int[n];
    Arrays.fill(color,-1);
    for(int i=0;i<n;i++){
        if(color[i]==-1 && !dfs(i,graph,color)){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        // now convert it into adj list
        List<List<Integer>> graph=new ArrayList<>();
        // intilise it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        System.out.println(isBipartite(graph,n));
    }
}
