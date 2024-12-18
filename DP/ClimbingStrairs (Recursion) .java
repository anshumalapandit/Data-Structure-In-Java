// it will tle error also its not efficient bcoz reptitive call going to same n ..
  class Solution {
    public int climbStairs(int n) {
        if(n==0){
            // its means we are on ground or ground se ground tak jane k ways means dont move - 1 ways
            return 1;
        }
        if(n<0){
            return 0;
        }

        return climbStairs(n-1)+climbStairs(n-2);
    }
}
