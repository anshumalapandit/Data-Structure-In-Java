import java.io.*;
import java.util.*;

public class Solution {
public static void commonElement(int arr1[],int n1,int arr2[],int n2){
    HashMap<Integer,Boolean>hm=new HashMap<>();
    for(int i=0;i<n1;i++){
        hm.put(arr1[i],true);
    }
    for(int i=0;i<n2;i++){
        if(hm.containsKey(arr2[i]) && hm.get(arr2[i])==true){
            System.out.println(arr2[i]);
            hm.put(arr2[i],false);
        }
    }
   
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        commonElement(arr1,n1,arr2,n2);
        
    }
}
