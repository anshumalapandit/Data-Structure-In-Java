// approch 1:
import java.io.*;
import java.util.*;

public class Solution {
public static int countDigit(int n){
    String s=String.valueOf(n);
    int len=s.length();
    return len;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countDigit(n));
    }
}
//Approach 2:
import java.io.*;
import java.util.*;

public class Solution {
public static int countDigit(int n){
    int count=0;
    while(n>0){
        count++;
        n=n/10;
    }
    return count;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countDigit(n));
    }
}
