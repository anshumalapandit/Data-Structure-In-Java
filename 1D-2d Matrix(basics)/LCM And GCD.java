// User function Template for Java

class Solution {
    public static int findGCD(int a,int b){
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int arr[]=new int[2];
        int gcd=findGCD(a,b);
        arr[1]=gcd;
        int lcm=a*b/gcd;
        arr[0]=lcm;
        return arr;
    }
}
