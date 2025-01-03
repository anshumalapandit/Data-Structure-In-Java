import java.io.*;
import java.util.*;

public class Solution {
public static int[] findSD(List<List<Integer>> graph,int n,int src){
    // intilise all distexcept src
    int dist[]=new int[n];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[src]=0;
    // using bfs approach
    Queue<Integer> q=new LinkedList<>();
    q.add(src);
    while(q.size()>0){
        // take out the current node
        int node=q.remove();
        // now check for its nbr
        for(int nbr:graph.get(node)){
            if(dist[nbr]>dist[node]+1){
                dist[nbr]=dist[node]+1;
                q.add(nbr);
            }
        }
    }
    return dist;
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
        // now takes edges info
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int src=sc.nextInt();
        int dist[]=findSD(graph,n,src);
        // print the distance
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
}
