// User function Template for Java

class Solution {
    static int dp[][];
    public static boolean isPalin(String s,int i,int j){
        if(i>j){
            return true;
        }
        int left=i;
        int right=j;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int helper(String s,int i,int j){
        // base case
        if(i>=j){
            return 0;
        }
        // if palindrone bhi hai then not possible furthwer partitioning
        if(isPalin(s,i,j)){
            return 0;
        }
        // before calling recusrion i will check is answer already stored if it is just use it
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // initialise it
        int min=Integer.MAX_VALUE;
        // loop for k
        for(int k=i;k<=j-1;k++){
            // find kro temp ans
        int tempans=helper(s,i,k)+helper(s,k+1,j)+1;
         min=Math.min(tempans,min);
        }
        return dp[i][j]=min;
    }
    static int palPartition(String s) {
        // code here
      int n=s.length()-1;
      dp=new int[s.length()+1][s.length()+1];
      for(int d[]:dp){
          Arrays.fill(d,-1);
      }
      return helper(s,0,n);
    }
}
