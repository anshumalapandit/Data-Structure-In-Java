// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        // This approach will works only if arrays contains all +ve elements
        int i=0;
        int j=0;
        int max=0;
        long sum=0;
        while(j<arr.length){
            // calculation kro
            sum=sum+arr[j];
            
            if(sum<k){
                // if desired sum achieve nhi hua hai to first acheieve it
                j++;
            }else if(sum==k){
                // ans calculate kro
                max=Math.max(max,j-i+1);
                // now remove sum of previous window 
                sum-=arr[i]; //removing previous sum
                // slide the window
               i++;
                j++;
            }else{
                // if sum>k
                while(i<=j && sum>k){
                    sum-=arr[i];
                    i++;
                }
                // j ko to hamehsa hi aage badhana hai 
                j++;
            }
        }
        return max;
    }
}
