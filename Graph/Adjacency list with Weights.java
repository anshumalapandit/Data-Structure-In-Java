import java.io.*;
import java.util.*;

public class Solution {
static class Pair{
    int nbr;
    int wt;
    Pair(int nbr,int wt){
        this.nbr=nbr;
        this.wt=wt;
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Pair> graph []=new ArrayList[n];
         // dont forget to intialise arraylist otherwise it will point to null and u will storing the value in null
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // take edges details
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int wt=sc.nextInt();
            graph[u].add(new Pair(v,wt));
            graph[v].add(new Pair(u,wt));
        }
       // print
        for(int i=0;i<n;i++){
            System.out.print(i+" -> {");
            for(int j=0;j<graph[i].size();j++){
                System.out.print("("+ graph[i].get(j).nbr+","+graph[i].get(j).wt+")");
            }
            System.out.println("}");
        }
    }
}
