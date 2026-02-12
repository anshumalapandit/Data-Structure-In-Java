// brute force
class Solution {

    public int helper(String substr, int arr[]) {

        // count frequencies
        for (int i = 0; i < substr.length(); i++) {
            char ch = substr.charAt(i);
            arr[ch - 'a']++;
        }

        int freq = 0; //This variable will store the frequency that all characters must match.

        for (int i = 0; i < 26; i++) {
            // we only care about the freq whose characters is present
            // how i do know which char is present , jiska freq arr mai >0 hoga
            if (arr[i] > 0) {
                if (freq == 0) {
                //When we find first non-zero frequency,
            //we store it as standard. or we are assuming first freq of first char as a std
                    freq = arr[i]; // stored 
                } else if (arr[i] != freq) {
                    // everytime for next character
                    // i'll compare with std freq if at any point i found mismatch
                    // not balanced return immediately.
                    return 0; // not balanced
                }
            }
        }

        return substr.length();
    }

    public int longestBalanced(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String substr = s.substring(i, j + 1);
                int arr[] = new int[26];

                int len = helper(substr, arr);
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}
