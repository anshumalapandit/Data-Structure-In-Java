class Solution {
    static int dp[][];

    public String Lcs(String s1, String s2, int n, int m) {
        // initialization
        dp = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // choice program code
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        // now backtrack to get LCS
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        String lcs = Lcs(str1, str2, n, m);

        int i = 0, j = 0;
        StringBuilder scs = new StringBuilder();

        // merge using LCS
        for (char c : lcs.toCharArray()) {
            while (i < n && str1.charAt(i) != c) {
                scs.append(str1.charAt(i++));
            }
            while (j < m && str2.charAt(j) != c) {
                scs.append(str2.charAt(j++));
            }
            scs.append(c);
            i++;
            j++;
        }

        // Add remaining chars
        scs.append(str1.substring(i));
        scs.append(str2.substring(j));

        return scs.toString();
    }
}
