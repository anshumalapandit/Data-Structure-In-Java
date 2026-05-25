class Solution {
    public boolean valid(int n,int k){
        int root=(int)Math.round(Math.pow(n,1.0/k));
        
        return Math.pow(root, k) == n;
        
    }
    public int countKthRoots(int l, int r, int k) {
        int count=0;
        for(int i=l;i<=r;i++){
            if(valid(i,k)){
                count++;
            }
        }
        return count;
    }
}©leetcode
