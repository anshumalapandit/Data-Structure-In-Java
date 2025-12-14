class Solution {
    public int BS(int arr[],int target){
        int res=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                // but how i am sure that this is only my first occurene
                // but yes it may be possible candidate
                res=mid;
                //now i will check left side for first occurence continuous
                end=mid-1;
            }else if(target<arr[mid]){
                // go to left
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public int BS2(int arr[],int target){
        int res=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                // but how i am sure that this is only my last occurene
                // but yes it may be possible candidate
                res=mid;
                //now i will check rightside for last occurence continuous
                start=mid+1;
            }else if(target<arr[mid]){
                
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    int countFreq(int[] arr, int target) {
        // code here
        // what if target present hoga sorted array
        // obvious sath mai hoga in a continuous phasion
        // unsorted = target scatterd hota 
        // count= last occurence idx -first occurence idx+1;
        // we know that how to find first occ , last occ idx
        int count=0;
        int first=BS(arr,target);
        int last=BS2(arr,target);
        if(first!=-1 ||  last!=-1)
            count=last-first+1;
        else
        return 0;
        return count;
    }
}
