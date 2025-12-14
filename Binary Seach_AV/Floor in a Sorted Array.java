class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int start=0;
        int end=arr.length-1;
    
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=x){
                // it should be valid candidate
                idx=mid;
            // now i want greater element of it then i will instantly move to right side
             start=mid+1;
            }
            else if(x<=arr[mid]){
                // definitley i will get smaller element in left side
                end=mid-1;
            }
        }
        return idx;
    }
}
