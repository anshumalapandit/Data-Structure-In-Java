class Solution {
    public int scoreOfString(String s) {
      int score=0;
      for(int i=0;i<s.length()-1;i++){
        int j=i+1;
        int diff=Math.abs(s.charAt(i)-s.charAt(j));
        score+=diff;
      }
      return score;
    }
}
