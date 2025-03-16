class Solution {
    public boolean isPossible(int ranks[],long mid,int cars){
        long carFixed=0;
        for(int i=0;i<ranks.length;i++){
            carFixed+=Math.sqrt(mid/ranks[i]); // from formula n=sqrt(time/ranks)
        }
        return carFixed>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=1;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<ranks.length;i++){
            max=Math.max(ranks[i],max);
        }
        long r=max*cars*cars; // isko sare car de denge 
        long result=-1;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isPossible(ranks,mid,cars)){
                result=mid;
                // minumum chahiye right ko kam karenge 
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}
