class Solution {
    public boolean divisorGame(int n) {
        if(n%2==0) return true;
        // ultimately jiske paas 2 aayega wahi jitega
        return false;
    }
}
class Solution {
    public boolean divisorGame(int n) {
        if(n<=1){
            return false; // no chance of move alice will lose
        }
        for(int x=1;x<n;x++){
            if(n%x==0){
                return !divisorGame(n-x);
            }
        }
        return false;
    }
}
// DP wala solution :
class Solution {
    Boolean[] dp;

    public boolean divisorGame(int n) {
        dp = new Boolean[n + 1];
        return canWin(n);
    }

    private boolean canWin(int n) {
        if (n <= 1) return false;
        if (dp[n] != null) return dp[n]; // already solved

        for (int x = 1; x < n; x++) {
            if (n % x == 0 && !canWin(n - x)) {
                return dp[n] = true;
            }
        }
        return dp[n] = false;
    }
}
