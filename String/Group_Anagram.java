import java.io.*;
import java.util.*;

public class Solution {
public static List<String> groupAnagram(String arr[],int n){
    HashMap <String, List<String>> map=new HashMap<>();
    
    for(int i=0;i<n;i++){
        String cur=arr[i];
        char a[]=cur.toCharArray();
        Arrays.sort(a);
        // convert back to string
       cur=String.valueOf(a);
        if(!map.containsKey(cur)){
            List<String> value=new ArrayList<>();
            // add the original one 
            value.add(arr[i]);
            // now add this into map
            map.put(cur,value);
        }else {
            // means already exist 
            List<String> value=map.get(cur);
            value.add(arr[i]);
        }
    }
    List<String> ans=new ArrayList<>();
    // now store into ans all list 
    for(String key:map.keySet()){
        ans.addAll(map.get(key));
        }
    return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        List<String> ans=groupAnagram(arr,n);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
