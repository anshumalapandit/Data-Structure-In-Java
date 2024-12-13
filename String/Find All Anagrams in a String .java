import java.io.*;
import java.util.*;

public class Solution {
public static int[] allAnagram(String s,String p){
    if(p.length()>s.length()){
        return new int[0];
    }
    int s_freq[]=new int[26];
    int p_freq[]=new int[26];
    for(int i=0;i<p.length();i++){
        p_freq[p.charAt(i)-'a']++;
        s_freq[s.charAt(i)-'a']++;
    }
    int j=0,i=p.length()-1;
    ArrayList<Integer> arr=new ArrayList<>();
    while(i<s.length()){
        // check both freq array equals or not
        if(Arrays.equals(s_freq,p_freq)){
        // add starting index into it
        arr.add(j);
        }
    // if not equal i++ j-- freq ko
    i++;
    // again check that i is < than s.len or not bcoz u r increasing here may be ite becomes out of loop
    if(i<s.length()){
        s_freq[s.charAt(i)-'a']++;
    }
        s_freq[s.charAt(j)-'a']--;
        j++;
    }
    int ans[]=new int[arr.size()];
    // my answer is in arr now copy it in ans []
    for( i=0;i<ans.length;i++){
        ans[i]=arr.get(i);
    }
    return ans;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        int ans[]=allAnagram(s,p);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
