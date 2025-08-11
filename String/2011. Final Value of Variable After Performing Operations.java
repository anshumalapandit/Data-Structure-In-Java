class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String op:operations){
          //  int totalOp=2; // for sure ++ / -- 2 hi operator hoga
            if(op.charAt(0)=='+' || op.charAt(op.length()-1)=='+'){
                    ans++;
            }else{
                // obviously - hoga
                   ans--;
                }
            }
        return ans;
    }
}
