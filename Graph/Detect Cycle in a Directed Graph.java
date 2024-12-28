import java.io.*;
import java.util.*;

public class Solution {
public static boolean dfs(int node,int vis[],int pathvis[],List<List<Integer>> graph,int n){
    // 1. mark the node as visited 
    vis[node]=1;
    pathvis[node]=1;
    // check its neighbour
    for(int nbr:graph.get(node)){
        if(vis[nbr]==0){
            if(dfs(nbr,vis,pathvis,graph,n)){
                return true;
            }
        }else{
            // if visited 
            if(pathvis[nbr]==1){
                return true;
            }
        }
    }
    pathvis[node]=0;
    return false;
}
public static boolean isCycle(List<List<Integer>> graph,int n){
    int vis[]=new int[n];
    int pathvis[]=new int[n];
    for(int i=0;i<n;i++){
        if(vis[i]==0){
        if(dfs(i,vis,pathvis,graph,n)==true){
            return true;
        }
        }
    }
    return false;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // take edges info
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
        }
        System.out.println(isCycle(graph,n));
    }
}
