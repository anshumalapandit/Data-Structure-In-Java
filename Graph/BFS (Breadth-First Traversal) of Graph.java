import java.io.*;
import java.util.*;

public class Solution {
public static void bfs(ArrayList<Integer> graph[]){
    int vis[]=new int[graph.length];
    Queue<Integer> q=new LinkedList<>();
    vis[0]=1;
    q.add(0);
    while(q.size()>0){
        // take out the curr node
        int curNode=q.poll();
        // print the curr Node
        System.out.print(curNode+" ");
        // add its unvisited neigbour into queue
        for(int i=0;i<graph[curNode].size();i++){
            int nbr=graph[curNode].get(i);
            if(vis[nbr]==0){
                // if unvisited then add it
                // b4 adding mark it visited
                vis[nbr]=1;
                q.add(nbr);
            }
        }
    }
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        // take edges details
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        bfs(graph);
    }
}
