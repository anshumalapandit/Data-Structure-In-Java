import java.io.*;
import java.util.*;

public class Solution {
public static int power(int n,int p){
    if(p==0){
        return 1;
    }
    int subans=power(n,p/2);
    int ans=subans*subans;
    if(p%2!=0){
        // odd 
        ans*=n; // dont write 2 ..base aalag bhi ho sakta hai
    }
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(power(n,p));
    }
}
