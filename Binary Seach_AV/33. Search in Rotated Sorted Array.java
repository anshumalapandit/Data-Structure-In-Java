class Solution {
    public int BS(int arr[],int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int helper(int arr[]){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<=arr[end]){
            // array is already sorted , not rotation 
            return 0;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%arr.length;
            int prev=(mid+arr.length-1)%arr.length;
            // edges cases ,what if mid is first ele,or last elem
            // for that next ,prev we should handle peroperly
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                // if ye apne dono neighbour se chota hai means yahi min hai
                return mid;
            }
            // find unsorted part move in taht direction
            if(arr[end]<arr[mid]){
                // end ko bada hona chahiye tha but ye to chota hai
                // means kuch to gadbad hai .. ye unsorted hai
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0; // at last
    }
    public int search(int[] nums, int target) {
// i know how to find minimum element in rotated sorted array i will use that concept here
// as i get min ele idx , after uske aaray => sorted , uspe pehle part => sorted
// then i can apply BS on both side , i will get target variable ka idx where it is present
int minIdx=helper(nums);
// lets find on left half
int left=BS(nums,0,minIdx-1,target);
int right=BS(nums,minIdx,nums.length-1,target);
return left==-1?right:left;
    }
}
