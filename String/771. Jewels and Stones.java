class Solution {
    public static boolean isJewel(char cur,String jewels){
        for(int i=0;i<jewels.length();i++){
            if(jewels.charAt(i)==cur){
                return true;
            }
        }
        return false;
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char cur=stones.charAt(i);
            if(isJewel(cur,jewels)){
                count++;
            }
        }
        return count;
    }
}
