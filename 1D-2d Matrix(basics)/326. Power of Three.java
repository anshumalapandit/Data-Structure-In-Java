class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        long left=1;
        long right=n;
        while(left<=right){
            long mid=(left+right)/2;
            long power=(long) Math.pow(3, mid); // remember power of 3 chahiye not cube
            if(power==n){
                return true;
            }else if(power<n){
                left=mid+1;
            }else{
                right=mid-1;
            }
            // Avoid overflow
            // if (power> n || power < 0) {
            //     right = mid - 1;
            // }
        }
        return false;
    }
}
// optimised way :
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
         while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
