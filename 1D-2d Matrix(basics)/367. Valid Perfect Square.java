class Solution {
    public boolean isPerfectSquare(int num) {
        // base casr
        if(num==1){
            return true;
        }
        for(int i=2;i*i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}
//but this is very less efficient
//The O(√n) complexity might be too slow for large inputs. Let's switch to a binary search approach to improve the time complexity to O(log n).
class Solution {
    public boolean isPerfectSquare(int num) {
    // we know perfect square ka root 1 se uske half value k bich mai hi hoga
    if(num<2){ // 1  perfect sq hai
        return true;
    }
    long left=2; // we will start from 2
    long right=num/2;
    while(left<=right){
         long mid = left + (right - left) / 2;
        long square=mid*mid;
        if(square==num){
            return true;
        }
        else if(square>num){ // we are comparing square with num not mid
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return false;
    }
}
