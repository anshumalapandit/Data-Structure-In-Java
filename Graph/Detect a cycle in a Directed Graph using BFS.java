import java.io.*;
import java.util.*;

public class Solution {
public static boolean isCycle(int indegree[],List<List<Integer>> graph,int n){
    int count=0;
    Queue<Integer> q=new LinkedList<>();
    // add all node in queue whose indegree is 0
    for(int i=0;i<n;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    while(q.size()>0){
        // take out the node 
        int node=q.remove();
        count++; // instead of printing inc count 
        // check for its neighbour
        for(int nbr:graph.get(node)){
            indegree[nbr]--;
            if(indegree[nbr]==0){
                q.add(nbr);
            }
            
        }
    }
    if(count==n) return false;
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> graph=new ArrayList<>();
        // initliase it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        // take edges details
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            // egde coming towards v inc the indegree of v
            indegree[v]++;
        }
        System.out.println(isCycle(indegree,graph,n));
    }
}
