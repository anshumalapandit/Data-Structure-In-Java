class Solution {
    public int[] minOperations(String boxes) {
      int ans[]=new int[boxes.length()];
      for(int i=0;i<boxes.length();i++){
        int totalBalls=0;
        for(int j=0;j<boxes.length();j++){
            if(boxes.charAt(j)=='1'){
                totalBalls+=Math.abs(i-j);
            }
        }
        ans[i]=totalBalls;
      }
      return ans;   
    }
}
