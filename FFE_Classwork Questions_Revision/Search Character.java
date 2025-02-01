import java.io.*;
import java.util.*;

public class Solution {
public static char search(char a[],int n,char target){
    int start=0;
    int end=n-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(a[mid]==target){
            return a[mid+1];
        }
        if(target<a[mid]){
            // go to left
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return '0';
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char target=sc.next().charAt(0);
        int n=sc.nextInt();
        char a[]=new char[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
        char ans=search(a,n,target);
        if(ans=='0'){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
        
    }
}
