class Solution {
    public int[] findErrorNums(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp^=nums[i];
            temp^=(i+1);
        }
        int setBit=(temp & (-temp));
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if((nums[i]&setBit)==0){
                ans[0]^=nums[i];
            }else{
                ans[1]^=nums[i];
            }
        }
        // for indexing
        for(int i=1;i<=nums.length;i++){
            if((setBit & i)==0){
                ans[0]^=i;
            }else{
                ans[1]^=i;
            }
        }
        // now wil check that my answer is in correct order or not
        for(int i=0;i<nums.length;i++){
            if(ans[0]==nums[i]){
                return ans;
            }
        }
        int tem=ans[0];
        ans[0]=ans[1];
        ans[1]=tem;
        return ans;
    }
}
