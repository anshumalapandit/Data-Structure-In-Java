// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // find mid
            int mid=start+(end-start)/2;
            // here target element can be present at ith , i-1,i+1 so check all
            if(arr[mid]==target) return mid;
            // before checking mid-1 mid+1 do carefully might not go out of bound or invalid
            if(mid-1>=start && arr[mid-1]==target){
                return mid-1;
            }
            if(mid+1<=end && arr[mid+1]==target){
                return mid+1;
            }
            // now move to left right
            // but remember u already checked mid-1,mid+1 so move ur start,end pointer to +2 steps
            if(target<=arr[mid]){
                // left side move karn ahai
                end=mid-2;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
