import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int E=sc.nextInt();
        // use list of list
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<N;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<E;i++){
         int src=sc.nextInt();
         int dest=sc.nextInt();
         graph.get(src).add(dest);
         graph.get(dest).add(src);
        }
        for(int i=0;i<N;i++){
            System.out.print(i+" "); // printing node
            // for(int j=0;j<n;j++); { // wrong step 
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" "); // print it adjacent node;
            }
            System.out.println();
        }
    }
}
