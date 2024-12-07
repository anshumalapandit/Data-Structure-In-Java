import java.io.*;
import java.util.*;

public class Solution {
public static void kSorted(int arr[],int n,int k){
    PriorityQueue <Integer> pq=new PriorityQueue<>();
    for(int i=0;i<=k;i++){
        pq.add(arr[i]);
    }
    // take out the min element and add it to pq again
    for(int i=k+1;i<n;i++){
        System.out.println(pq.poll());
        pq.add(arr[i]);
    }
    // print it
    while(pq.size()>0){
        System.out.println(pq.poll());
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        kSorted(arr,n,k);
    }
}
