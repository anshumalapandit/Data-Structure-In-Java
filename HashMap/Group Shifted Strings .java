import java.io.*;
import java.util.*;

public class Solution {
public static List<String> groupShifted(String arr[],int n){
    HashMap<String,List<String>> map=new HashMap<>();
    for(int i=0;i<n;i++){
        String str=arr[i];
        int offset=str.charAt(0)-'a';
        String keys="";
        for(int j=0;j<str.length();j++){
            char ch=(char)(str.charAt(j)-offset);
            if(ch<'a'){
                ch+=26;
            }
            keys+=ch;
        }
        if(!map.containsKey(keys)){
            List<String> value=new ArrayList<>();
            value.add(str);
            map.put(keys,value);
        }else{
            List<String> value=map.get(keys);
            value.add(str);
        }
    }
        List<String> ans=new ArrayList<>();
        for(String keys: map.keySet()){
            ans.addAll(map.get(keys));
        }
    return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        List<String> ans=groupShifted(arr,n);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
