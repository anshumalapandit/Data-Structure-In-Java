class Solution {
    public boolean checkPowersOfThree(int n) {
        // divide repeatedly 3 
        // we are dividing by 3 so possible remainder w.k.t [0,2]
        while(n>0){
            if(n%3==2){
                return false; 
            }
            n=n/3;
        }
        return true; 
    }
}
