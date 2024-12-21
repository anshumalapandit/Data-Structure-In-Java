import java.io.*;
import java.util.*;

public class Solution {
    public static boolean dfs(List<List<Integer>> graph,int vis[],int node,int parent){
        //steps:
        // mark the node
        // check the neighbour visited or not
        // call the dfs  if univisited else ->
        // neighbour!= parent ->cycle exist
        vis[node]=1;
        for(int nbr:graph.get(node)){
            if(vis[nbr]==0){
                return dfs(graph,vis,nbr,node);
            }else if(nbr!=parent){
                    return true;
                }
            }
        return false;
    }
public static boolean isCycle(List<List<Integer>> graph,int n){
    int vis[]=new int[n];
    for(int i=0;i<n;i++){
        if(vis[i]==0){
            // if unvisited 
            if(dfs(graph,vis,i,-1)){
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
        //intilise it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // edges details
        for(int i=0;i<m;i++){
            int src=sc.nextInt();
            int dest=sc.nextInt();
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        System.out.println(isCycle(graph,n));
    }
}
