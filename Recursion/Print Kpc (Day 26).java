import java.io.*;
import java.util.*;

public class Solution {
public static String word[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void printKpc(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return;
    }
    char ch=s.charAt(0);
    String ros=s.substring(1);
    String curWord=word[ch-'0'];
    for(int i=0;i<curWord.length();i++){
        char c=curWord.charAt(i);
        printKpc(ros,ans+c); // remember to pass ros,ans+ch part of an answre
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printKpc(s,"");
    }
}
