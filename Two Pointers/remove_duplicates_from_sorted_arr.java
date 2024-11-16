import java.io.*;
import java.util.*;

public class Solution {
public static void removeDuplicate(int arr[],int n){
    int j=0;
    int i=1;
    int count=1;
    while(i<n){
        if(arr[i]==arr[j]){
            i++;
        }else{
            count++;
            j=i;
            i++;
        }
    }
    System.out.println(count);
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        removeDuplicate(arr,n);
    }
}
