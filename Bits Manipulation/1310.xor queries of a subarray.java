class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int pXor[]=new int[arr.length];
        pXor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pXor[i]=pXor[i-1]^arr[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            if(left==0){
                ans[i]=pXor[right];
            }else{
                ans[i]=pXor[left-1]^pXor[right];
            }
        }
        return ans;
    }
}
