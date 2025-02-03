import java.io.*;
import java.util.*;

public class Solution {
public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
    if(sr>dr || sc>dc){
        return new ArrayList<>();
    }
    if(sr==dr && sc==dc){
        // its means we reached yahuu
        ArrayList<String> a=new ArrayList<>();
        a.add("");
        return a;
    }
    ArrayList<String> hpath=getMazePath(sr,sc+1,dr,dc);
    ArrayList<String> vpath=getMazePath(sr+1,sc,dr,dc);
    ArrayList<String> ans=new ArrayList<>();
    for(int i=0;i<hpath.size();i++){
        ans.add("h"+hpath.get(i));
    }
    for(int i=0;i<vpath.size();i++){
        ans.add("v"+vpath.get(i));
    }
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> ans=getMazePath(0,0,n-1,m-1);
        System.out.println(ans);
    }
}
