class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0;
        int end=arr.length-1;
        char ans=arr[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                // now i want more smaller than this too 
                // instantly i will go to left side for finding smallest but greater char
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
