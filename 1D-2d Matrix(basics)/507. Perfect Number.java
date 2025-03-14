class Solution {
    public boolean checkPerfectNumber(int num) {
        long sum=0;
        for(int i=1;i<=num/2;i++){
          if(num%i==0){
            sum+=i;
          } // dont check inside the loop
        //  You need to calculate the full sum of divisors first.
        // perfect num= sum of all positive diviosr except itself checking at every step might give wrong result
        }
        return sum==num;
    }
}
