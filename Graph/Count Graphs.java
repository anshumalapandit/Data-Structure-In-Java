import java.io.*;
import java.util.*;

public class Solution {
public static int totalGraph(int vertices){
    int edges=vertices*(vertices-1)/2;
    int ans=(int)Math.pow(2,edges);
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        System.out.println(totalGraph(vertices));
    }
}
