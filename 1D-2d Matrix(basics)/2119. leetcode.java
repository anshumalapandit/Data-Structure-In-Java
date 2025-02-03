class Solution {
    public static int reverse(int n){
        int ans=0;
        int power=1;
        while(n%10==0){
            n=n/10;
        }
        while(n!=0){
            int ld=n%10;
            ans=ans+(power*ld);
            n=n/10;
            power*=10;
        }
        return ans;
    }
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        int r1=reverse(num);
        int r2=reverse(r1);
        return num==r2;
    }
}
