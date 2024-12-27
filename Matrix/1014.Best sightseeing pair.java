// but this will give tle error brute force
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values.length;j++){
                if(i<j){
                    int curSum=values[i]+values[j]+i-j;
                    maxx=Math.max(maxx,curSum);
                }
            }
        }
        return maxx;
    }
}
// optimised way 0(n)
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
         int res = Integer.MIN_VALUE;
        int maxLeft = values[0]; // value[i] + i
        
        for(int i = 1; i < values.length; i++){
            res = Math.max(res, maxLeft + values[i] - i);
            maxLeft = Math.max(maxLeft, (values[i] + i));
        }
        return res;
    }
}
