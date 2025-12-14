class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        // try to find minimum element , jaha min element hoga jis idx pe utne time hi sorted hoga
        // in sorted array , min ele is present at idx 0, thats is 0 times rotated 
        // brute force = > we can find min element by linear serach=> 0(n)
        // but it is given that it is sorted so i will try to use binary serach
        // min element => jo dono side se chota hoga
        // move => unsorted side
        // base case if first ele <= end => array is sorted already , 0th rotation
        int start=0;
        int end=arr.length-1;
        
        int n=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                // if apne dono neighbour se chota hai yani yahi mera minimum element hai
                return mid;
            }
            if(arr[end]<arr[mid]){
                // its means right side unsorted hai lets move
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        // if we got no answer means array is sorted already means min element present at first idx.
        return 0;
    }
}
