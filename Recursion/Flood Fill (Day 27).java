import java.io.*;
import java.util.*;

public class Solution {
public static List<String> ff(int sr,int sc,int dr,int dc,int arr[][],boolean vis[][]){
    if(sr<0 || sc<0 || sr>=arr.length || sc>=arr[0].length || arr[sr][sc]==1 || vis[sr][sc]){
        return new ArrayList<>();
    }
    if(sr==dr && sc==dc){
        List<String> a=new ArrayList<>();
        a.add("");
        return a;
    }
    vis[sr][sc]=true;
    List<String> top=ff(sr-1,sc,dr,dc,arr,vis);
    List<String> left=ff(sr,sc-1,dr,dc,arr,vis);
    List<String> down=ff(sr+1,sc,dr,dc,arr,vis);
    List<String> right=ff(sr,sc+1,dr,dc,arr,vis);
    List<String> ans=new ArrayList<>();
    for(int i=0;i<top.size();i++){
        ans.add("t"+top.get(i));
    }
    for(int i=0;i<left.size();i++){
        ans.add("l"+left.get(i));
    }
    for(int i=0;i<down.size();i++){
        ans.add("d"+down.get(i));
    }
    for(int i=0;i<right.size();i++){
        ans.add("r"+right.get(i));
    }
    vis[sr][sc]=false;
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // if(arr[n-1][m-1]==1){
        //     return;
        // }
        boolean vis[][]=new boolean[n][m];
        List<String> ans=ff(0,0,n-1,m-1,arr,vis);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
