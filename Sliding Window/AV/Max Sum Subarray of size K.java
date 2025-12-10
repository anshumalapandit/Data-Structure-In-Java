class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0;
        int j=0;
        int sum=0;
        int max=0;
        while(j<arr.length){
            // sum to calculate karna hi hai
            sum+=arr[j];
            // first goal = try to achieve window wise
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                // once i hit window size i will maintain it
                // first update the max sum 
                max=Math.max(max,sum);
                // then update sum 
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
