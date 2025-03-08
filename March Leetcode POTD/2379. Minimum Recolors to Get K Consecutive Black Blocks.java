class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int right=0;
        int total_white=0;
        int min_recolor=Integer.MAX_VALUE;
        while(right<blocks.length()){
            if(blocks.charAt(right)=='W'){
                total_white++;
            }
            // k consecutive found
            if(right-left+1==k){
               min_recolor=Math.min(min_recolor,total_white);
               if(blocks.charAt(left)=='W'){
                total_white--;
               }
                left++;

            }
             right++;
        }
        return min_recolor;
    }
}
