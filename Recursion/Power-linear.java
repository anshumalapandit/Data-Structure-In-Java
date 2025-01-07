import java.io.*;
import java.util.*;

public class Solution {
public static int linear(int n,int p){
    if(p==0){
        return 1;
    }
    
    int subans=linear(n,p-1);
    int ans=n*subans;
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(linear(n,p));
    }
}
