import java.io.*;
import java.util.*;

public class Solution {
public static int Freq(int n,int target){
    int count=0;
    while(n>0){
        int lastD=n%10;
        if(lastD==target){
            count++;
        }
        n=n/10;
    }
    return count;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(Freq(n,target));
    }
}
