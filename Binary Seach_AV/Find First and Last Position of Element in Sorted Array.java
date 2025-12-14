class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        // since array is sorted so always think about binary search
        int start=0;
        int end=nums.length-1;
        while(start<=end){
         // find mid
         int mid=start+(end-start)/2;
         // if its == mid but i am not sure that it is first occurence
         // so finding first occ i will update my end pointer to check in left side
         if(nums[mid]==target){
            // but this mid also can be possible result 
            ans[0]=mid;
            end=mid-1;
         }
         else if(target<nums[mid]){
            // it will we definitely find in left side 
            end=mid-1;
         }else{
            start=mid+1;
         }
        }
        // for right k liye dont forget to reset both  pointers 
        // 🔹 Reset pointers
        start = 0;
        end = nums.length - 1;
        while(start<=end){
         // find mid
         int mid=start+(end-start)/2;
         // if its == mid but i am not sure that it is last occurence
         // so finding last occ i will update my start pointer to check in right side
         if(nums[mid]==target){
            // but this mid also can be possible result 
            ans[1]=mid;
            start=mid+1;
         }
        else if(target<nums[mid]){
            // it will we definitely find in left side 
            end=mid-1;
         }else{
            start=mid+1;
         }
        }
        
        return ans;
    }
}
