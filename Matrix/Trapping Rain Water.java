class Solution {
    public int[] rightMax(int arr[],int n){
        int ans[]=new int[n];
        int Max=0;
        for(int i=n-2;i>=0;i--){
            int curMax=arr[i+1];
            Max=Math.max(curMax,Max);
            ans[i]=Max;
        }
        return ans;
    }
    public int[] leftMax(int arr[],int n){
        int ans[]=new int[arr.length];
        int Max=0;
        for(int i=1;i<arr.length;i++){
            int curMax=arr[i-1];
            Max=Math.max(curMax,Max);
            ans[i]=Max;
        }
        return ans;
    }
    public int maxWater(int arr[]) {
        // code here
        // better solution 
        int NGL[]=leftMax(arr,arr.length);
        int NGR[]=rightMax(arr,arr.length);
        int ans=0;
        for(int i=1;i<arr.length-1;i++){
            int minHt=Math.min(NGL[i],NGR[i]);
            int hold=minHt-arr[i];
            if(hold<0) continue;
            ans+=hold;
        }
        return ans;
    }
}
