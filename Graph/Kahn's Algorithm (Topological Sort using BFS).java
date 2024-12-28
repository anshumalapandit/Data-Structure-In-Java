import java.io.*;
import java.util.*;

public class Solution {
public static void topSort(int indegree[],List<List<Integer>> graph,int n){
    Queue<Integer> q=new LinkedList<>();
    // step 1: nodes having indegree 0 add to queue
    for(int i=0;i<n;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    while(q.size()>0){
        int node=q.remove();
        System.out.print(node+" ");
        for(int nbr:graph.get(node)){
            indegree[nbr]--;
            if(indegree[nbr]==0){
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
        List<List<Integer>> graph=new ArrayList<>();
        // initliase it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        //take edges details
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            // top sort is only for DAG 
            graph.get(u).add(v);
            indegree[v]++;
        }
        topSort(indegree,graph,n);
    }
}
