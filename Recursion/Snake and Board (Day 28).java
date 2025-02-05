import java.io.*;
import java.util.*;

public class Solution {
public static void sb(int curPos,int size,int faces,ArrayList<String> paths,String ans){
    // base case
    if(curPos>size){
        return;
    }
    if(curPos==size){
        // we reached
        paths.add(ans);
        return;
    }
    for(int i=1;i<=faces;i++){
        sb(curPos+i,size,faces,paths,ans+i);
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int faces=sc.nextInt();
        ArrayList<String> paths=new ArrayList<>();
        sb(0,size,faces,paths,"");
        System.out.println(paths.size());
        System.out.println(paths);
        for(int i=0;i<paths.size();i++){
            System.out.println(paths.get(i));
        }
    }
}
