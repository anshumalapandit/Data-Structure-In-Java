package DP;

public class tabulation {
public static int tabu(int n,int dp[]) {
	dp[0]=0; // har ek index ko kuch meaning
	dp[1]=1;
	for(int i=2;i<=n;i++) { 
		dp[i]=dp[i-1]+dp[i-2]; // start filling small to large
	}
	return dp[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         int dp[]=new int[n+1]; // initlise table 
         System.out.println(tabu(n,dp));
	}

}
