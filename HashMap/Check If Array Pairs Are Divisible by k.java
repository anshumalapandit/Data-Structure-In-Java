import java.io.*;
import java.util.*;

public class Solution {
    // T.c => 0(N)
public static boolean checkPair(int a[],int n,int k){
    HashMap<Integer,Integer> map=new HashMap<>();
    // step 1 : add all remainder + its count
    for(int i=0;i<n;i++){
        int rem=a[i]%k;
        map.put(rem,map.getOrDefault(a[i],0)+1);
    }
    for(int i=0;i<n;i++){
        int rem=a[i]%k;
        if(rem==0){
            if(map.get(rem)%2!=0){
                return false;
            }
        }else if(2*rem==k){
            if(map.get(rem)%2!=0){
                return false;
            }
        }else{
            int rem2=k-rem;
            if(map.get(rem)!=map.get(rem2)){
                return false;
            }
        }
    }
    return true;
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(checkPair(a,n,k));
    }
}
