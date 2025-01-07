import java.io.*;
import java.util.*;

public class Solution {
public static int[] allIndices(int arr[],int n,int index,int key,int count){
 
    if(index==n){
        int ans[]=new int[count];
        return ans;
    }
    int ans[];
    if(arr[index]==key){
      ans=allIndices(arr,n,index+1,key,count+1);
        ans[count]=index;
    }else{
        ans=allIndices(arr,n,index+1,key,count);
    }
    return ans;
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
        int ans[]=allIndices(arr,n,0,key,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
