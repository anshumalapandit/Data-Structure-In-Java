// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        int ans=n | (1<<k);
        return ans;
    }
}
