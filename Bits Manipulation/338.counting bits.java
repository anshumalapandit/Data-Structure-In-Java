class Solution {
    public int countSetbit(int n){
        int ans=0;
        while(n!=0){
            ans++;
            n=n&(n-1);
        }
        return ans;
    }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=countSetbit(i);
        }
        return ans;
    }
}
