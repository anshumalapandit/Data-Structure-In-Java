class Solution {
    public int longestNiceSubarray(int[] nums) {
            int max=1;
            for(int i=0;i<nums.length;i++){
                int cur=0;
                for(int j=i;j<nums.length;j++){
                if ((cur & nums[j]) != 0) break; // Conflict found, stop checking
                  cur |= nums[j]; // Add nums[j] to the bitmask
                    max=Math.max(max,j-i+1);
                  
                }
            }
            return max;
    }
}
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i=0;
        int j=0;
        int mask=0;
        int result=1;
        while(j<nums.length){
            // keep shriking the array if not nice subarray
            while((mask & nums[j])!=0){
                mask=(mask ^ nums[i]);
                i++; // khud k sath hi xor operation kardo reduce ho jayega 
            }
            result=Math.max(result,j-i+1);
            mask|=nums[j];
            j++;
        }
        return result;
    }
}
