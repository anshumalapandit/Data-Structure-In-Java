import java.io.*;
import java.util.*;

public class Solution {
public static void helperdfs(int curNode,List<List<Integer>> graph,int vis[]){
    vis[curNode]=1;
    System.out.print(curNode+" ");
    // visit its first unvisited neighbour
  //  for(int node: graph.get(curNode)){ or u can write
        for(int i=0;i<graph.get(curNode).size();i++){
            int node=graph.get(curNode).get(i);
        if(vis[node]==0){
            // means if it is unvisited 
            // call dfs
            helperdfs(node,graph,vis);
        }
    }
}
public static void dfs(List<List<Integer>> graph,int n){
    int vis[]=new int[n];
    helperdfs(0,graph,vis);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> graph=new ArrayList<>();
        // initialise it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // take edges info
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        dfs(graph,n);
    }
}
