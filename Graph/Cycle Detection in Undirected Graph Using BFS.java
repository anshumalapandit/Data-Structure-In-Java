import java.io.*;
import java.util.*;

public class Solution {
public static class Pair{
    int node;
    int parent;
   public Pair(int node ,int parent){
        this.node=node;
        this.parent=parent;
    }
}
public static boolean bfs(List<List<Integer>> graph,int vis[],int node){
    vis[node]=1;
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(node,-1));
    while(q.size()>0){
        Pair cur=q.remove();
        // add its neighbout
        for(int nbr:graph.get(cur.node)){
            // only those neighbour which is unvisited
            if(vis[nbr]==0){
                vis[nbr]=1; // b4 mark its visited
                // univisited add in the queue
                q.add(new Pair(nbr,cur.node));
            }else if(cur.parent!=nbr){
                return true;
            }
        }
    }
    return false;
}
public static boolean isCycle(List<List<Integer>> graph,int n){
    int vis[]=new int[n];
    for(int i=0;i<n;i++){
        if(vis[i]==0){
        if(bfs(graph,vis,i)){
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
        // intilise
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
