class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int ans=0;
        int sum=0;
        int i=0;
        int j=0;
        while(i<k){
            sum+=arr[i];
            i++;
        }
        ans=Math.max(ans,sum);
        while(i<arr.length){
            sum+=arr[i];
            sum-=arr[j];
            j++;
            i++;
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
