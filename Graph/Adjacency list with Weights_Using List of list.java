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
        //ArrayList<Pair> graph []=new ArrayList[n];
        // using list of list
        List<List<Pair>> graph=new ArrayList<>();
        // intilise it
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // take edges details
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int wt=sc.nextInt();
            graph.get(u).add(new Pair(v,wt));
            graph.get(v).add(new Pair(u,wt));
        }
       // print
        for(int i=0;i<n;i++){
            System.out.print(i+" -> {");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print("("+ graph.get(i).get(j).nbr+","+graph.get(i).get(j).wt+")");
            }
            System.out.println("}");
        }
    }
}
