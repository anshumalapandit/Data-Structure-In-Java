class Solution {
    static int toggleBits(int n , int l , int r) {
        // code here
        int lmask=((1<<r)-1);
        int rmask=((1<<(l-1))-1);
        int finalMask= lmask^rmask;
        return n^finalMask;
      
    }
}
