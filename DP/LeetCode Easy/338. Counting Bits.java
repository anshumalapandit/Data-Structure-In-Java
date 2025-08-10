class Solution {
    public int[] countBits(int n) {
        //It’s considered a DP problem because the solution for i depends on results you’ve already computed for smaller numbers.
        int result[]=new int[n+1];
        // what if n==0 ?
        if (n == 0) {
            return result;
        }
        // then  this line will give u error of out of bound
        result[1]=1; // in 1 = total 1 bits 
        for(int i=2;i<=n;i++){
            if(i%2==0){
                // even number
                result[i]=result[i/2];
            }else{
                result[i]=result[i/2]+1;
            }
        }
        return result;
    }
}
