import java.io.*;
import java.util.*;

public class Solution {
public static void reverse(int arr[],int size,int target){
    int i=0;
    int j=size-1;
    while(i<j){
        int sum=arr[i]+arr[j];
        if(sum==target){
            System.out.println((i+1)+" "+(j+1));
            return;
        }else if(sum<target){
            i++;
        }else{
            j--;
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        reverse(arr,size,target);
    }
}
