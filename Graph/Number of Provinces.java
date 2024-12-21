import java.io.*;
import java.util.*;

public class Solution {
    // BFS approach
public static void bfsUtil(List<List<Integer>> graph,int vis[],int node){
    // visit the node . mark 1 add the source node
    // while pq.size()>0 take out the cur Node if its nbr unvi , visit it add its nbr
    vis[node]=1;
    Queue<Integer> q=new LinkedList<>();
    q.add(node);
    while(q.size()>0){
        int cur=q.remove();
        vis[cur]=1;
        for(int nbr:graph.get(cur)){
            if(vis[nbr]==0){
                bfsUtil(graph,vis,nbr);
            }
        }
    }
}
// DFS way
public static void dfsUtil(List<List<Integer>> graph,int vis[],int node){
       vis[node]=1;
    for(int nbr:graph.get(node)){
        if(vis[nbr]==0){
            vis[nbr]=1;
            dfsUtil(graph,vis,nbr);
        }
    }
    }
public static int provinces(List<List<Integer>> graph,int n){
    int count=0;
    int vis[]=new int[n];
    for(int i=0;i<n;i++){
        if(vis[i]==0){
            count++;
            dfsUtil(graph,vis,i);
        }
    }
    return count;
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
        // now convert this mat to adj list
        List<List<Integer>> graph=new ArrayList<>();
        // intilise it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // edges info
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=0){
                    graph.get(j).add(i);
                    graph.get(i).add(j);
                }
            }
        }
        System.out.println(provinces(graph,n));
    }
}
