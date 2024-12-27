import java.io.*;
import java.util.*;

public class Solution {
public static void dfs(int node,List<List<Integer>> graph,int vis[],Stack<Integer> s){
    vis[node]=1;
    for(int nbr: graph.get(node)){
        if(vis[nbr]==0){
            dfs(nbr,graph,vis,s);
        }
    }
    s.push(node);
}
public static void topSort(List<List<Integer>> graph,int V){
    int vis[]=new int[V];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<V;i++){
        if(vis[i]==0){
            dfs(i,graph,vis,s);
        }
    }
    while(s.size()>0){
        System.out.print(s.pop()+" ");
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
          //  graph.get(v).add(u); // remember top sort is only for DAG means directed graph dont add both side 
        }
        topSort(graph,V);
    }
}
