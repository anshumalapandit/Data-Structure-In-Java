import java.io.*;
import java.util.*;

public class Solution {
public static int firstIndex(int n,int arr[],int index,int key){
    if(index==n-1){
        if(arr[index]==key){
            return index;
        }else{
        return -1;
    }
    }
    if(arr[index]==key){
        return index;
    }
    return firstIndex(n,arr,index+1,key);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(firstIndex(n,arr,0,key));
    }
}
