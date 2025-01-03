import java.io.*;
import java.util.*;

public class Solution {
public static class Pair{
    int nbr;
    int wt;
    Pair(int nbr,int wt){
        this.nbr=nbr;
        this.wt=wt;
    }
}
public static int[] findSD(List<List<Pair>> graph,int n,int indegree[] ){
    Queue<Integer> q=new LinkedList<>();
    int dist[]=new int[n];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[0]=0;
    // add all nodes in queue whose indegree=0;
    for(int i=0;i<n;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    while(q.size()>0){
        // take out the current node
        int node=q.remove();
        // now check for its nbr
        for(Pair edge:graph.get(node)){
            int nbr=edge.nbr;
            int wt=edge.wt;
            // relaxation step
            if(dist[node]!=Integer.MAX_VALUE && dist[nbr]>dist[node]+wt){
                dist[nbr]=dist[node]+wt;
            }
            // decrese the indgree of nbr by 1
            indegree[nbr]--;
            // if its becomes 0 add it to queue
            if(indegree[nbr]==0){
                q.add(nbr);
            }
            
        }
    }
    for(int i=0;i<n;i++){
        if(dist[i]==Integer.MAX_VALUE){
            dist[i]=-1;
        }
    }
    return dist;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // nodes
        int m=sc.nextInt(); // edges
        List<List<Pair>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        // takes edges info
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int wt=sc.nextInt();
            graph.get(u).add(new Pair(v,wt));
            indegree[v]++;
        }
        int dist[]=findSD(graph,n,indegree);
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }
}
