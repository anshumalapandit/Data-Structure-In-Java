import java.io.*;
import java.util.*;

public class Solution {
public static char highes(String s){
    HashMap<Character,Integer> hm=new HashMap<>();
    for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))==true){
            int freq=hm.get(s.charAt(i));
            hm.put(s.charAt(i),freq+1);
        }else{
            hm.put(s.charAt(i),1);
        }
    }
    int maxfreq=Integer.MIN_VALUE;
    char ans='a';
    for(int i=0;i<s.length();i++){
        int freq=hm.get(s.charAt(i));
        if(freq>maxfreq){
            maxfreq=freq;
            ans=s.charAt(i);
        }
    }
    return ans;
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       System.out.println(highes(s));
    }
}
