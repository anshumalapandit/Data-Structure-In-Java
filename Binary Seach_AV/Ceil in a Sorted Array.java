// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
                ans=mid;
                // as i get greater element but i want smallest greater will defnitely
                // lie its left side isse bhi jyada smaller element 
                // i will move instantly here to the left side for more smallest larger element
                end=mid-1;
            }else if(x>arr[mid]){
                // i will get my ans in right side only
                start=mid+1;
            }
        }
        return ans;
    }
}
