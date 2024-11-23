import java.io.*;
import java.util.*;

public class Solution {
public static void CommonElement(int arr1[],int a2[],int n1,int n2){
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<n1;i++){
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
    for(int i=0;i<n2;i++){
        if(hm.containsKey(a2[i])){
            System.out.println(a2[i]);
            int freq=hm.get(a2[i]);
            if(freq==1){
                hm.remove(a2[i]);
            }else{
                hm.put(a2[i],freq-1);
            }
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
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        CommonElement(arr1,a2,n1,n2);
    }
}
