import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<Integer> graph[]=new ArrayList[N];
        for(int i=0;i<N;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<E;i++){
         int src=sc.nextInt();
         int dest=sc.nextInt();
         graph[src].add(dest);
         graph[dest].add(src);
        }
        for(int i=0;i<N;i++){
            System.out.print(i+" "); // printing node
            // for(int j=0;j<n;j++); { // wrong step 
            for(int j=0;j<graph[i].size();j++){
                System.out.print(graph[i].get(j)+" "); // print it adjacent node;
            }
            System.out.println();
        }
    }
}
