import java.io.*;
import java.util.*;

public class Solution {
public static String isTopSort(int indegree[],List<List<Integer>> graph,int n){
    Queue<Integer> q=new LinkedList<>();
    // step 1: add all node to q whose indeg is 0
    for(int i=1;i<=n;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    int count=0;
    while(q.size()>0){
        // take out the node
        int node=q.remove();
        count++;
        // now check for its nbr
        for(int nbr:graph.get(node)){
            indegree[nbr]--;
            if(indegree[nbr]==0){
                q.add(nbr);
            }
        }
    }
    if(count==n) return "Yes";
    return "No";
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt(); // total courses
        int preq=sc.nextInt(); //prequistite
        List<List<Integer>> graph=new ArrayList<>();
        // intilise it  but remember it is 1 based node so it will goes through <=total from 0
        for(int i=0;i<=total;i++){
            graph.add(new ArrayList<>());
        }
        int indegree[]=new int[total+1]; // remember it is 1 based node
        // take preq courses details
        for(int i=0;i<preq;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v); // top sort
            indegree[v]++;
        }
        System.out.println(isTopSort(indegree,graph,total));
    }
}
