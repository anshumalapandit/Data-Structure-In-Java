class Solution {
    public static int merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
       
        for(int i=0;i<n1;i++){
            left[i]=arr[i+l];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[j+1+mid];
        }
         int i=0;
        int j=0;
        int k=l;
        int result=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
                result+=(n1-i);
            }
            k++;
        }
        // add remainging element
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return result;
        
    }
    public static int helper(int arr[],int l,int r){
        int res=0;
        if(l<r){
            int mid=l+(r-l)/2;
            res+=helper(arr,l,mid);
            res+=helper(arr,mid+1,r);
            res+=merge(arr,l,mid,r);
        }
        return res;
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return helper(arr,0,arr.length-1);
    }
}
