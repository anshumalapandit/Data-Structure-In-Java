import java.io.*;
import java.util.*;

public class Solution {
public static String findCase(char ch){
    if(ch>='a' && ch<='z'){
        return "Small case";
    }else if(ch>='A' && ch<='Z'){
        return "Capital case";
    }else if(ch>='0' && ch<='9'){
        return "Digit";
    }
    return "None";
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        System.out.println(findCase(ch));
    }
}
