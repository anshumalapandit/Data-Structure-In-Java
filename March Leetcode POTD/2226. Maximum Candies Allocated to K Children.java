class Solution {
    public boolean canDistribute(int [] candies,int mid,long k){
        int n=candies.length;
        for(int i=0;i<n;i++){
            k-=candies[i]/mid;
            if(k<=0){ // all children got mid candles
                return true;
            }
        }
        return k<=0;
    }
    public int maximumCandies(int[] candies, long k) {
        int max=Integer.MIN_VALUE;
      
        long total=0;
        for(int i=0;i<candies.length;i++){
           max=Math.max(max,candies[i]);
           total+=candies[i];
        }
        if(total<k){
            return 0;
        }
        int l=1;
        int r=max;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canDistribute(candies,mid,k)){
                ans=mid;
                // lalach mai l or aage badhayenge
                l=mid+1;

            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
