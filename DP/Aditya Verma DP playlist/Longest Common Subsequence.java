// class Solution {
//     public static int helper(String s1,String s2,int n,int m){
//         if(n==0 || m==0){
//             return 0;
//         }
//         if(s1.charAt(n-1)==s2.charAt(m-1)){
//             return 1+helper(s1,s2,n-1,m-1);
//         }else{
//             return Math.max(helper(s1,s2,n-1,m) , helper(s1,s2,n,m-1));
//         }
//     }
//     static int lcs(String s1, String s2) {
//         // code here
//         // Recursive approach 
//         int n=s1.length();
//         int m=s2.length();
//         return helper(s1,s2,n,m);
//     }
// }
// now lets convert this code into emoization
class Solution {
    static int dp[][];
    public static int helper(String s1,String s2,int n,int m){
        if(n==0 || m==0){
            dp[n][m]=0;
            return dp[n][m];
            
        }
        // before comparing i will check is this value is already present in 
        // my storage if it is then wao and if not lets call recursiion
        if(dp[n][m]!=-1){
            // value mili hai pehle stored hai
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=1+helper(s1,s2,n-1,m-1);
        }else{
            dp[n][m]=Math.max(helper(s1,s2,n-1,m) , helper(s1,s2,n,m-1));
        }
        return dp[n][m];
    }
    static int lcs(String s1, String s2) {
        // code here
        // Recursive approach 
        int n=s1.length();
        int m=s2.length();
        dp=new int[n+1][m+1];
        // now initialize kro with -1 taki answer store hua ki nhi pata laga paye
         for (int[] row : dp) Arrays.fill(row, -1);
        return helper(s1,s2,n,m);
    }
}
