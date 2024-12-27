import java.io.*;
import java.util.*;

public class Solution {
public static boolean bfs(int node,List<List<Integer>> graph,int color[]){
    Queue<Integer> q=new LinkedList<>();
    q.add(node);
    color[node]=0; // by default yellow 
    while(q.size()>0){
        node =q.remove();
        for(int nbr: graph.get(node)){
            // case 1
            if(color[nbr]==-1){
                color[nbr]=1-color[node]; // smart way of giving opp color or writing rest it is same as if condn 
                q.add(nbr);
            }else if(color[nbr]==color[node]){
                return false;
            }
        }
    }
    return true;
}
public static boolean isBipartite(List<List<Integer>> graph,int n){
    int color[]=new int[n];
    Arrays.fill(color,-1);
    for(int i=0;i<n;i++){
        if(bfs(i,graph,color)){
            return true;
        }
    }
    return false;
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
