class Solution {
    public int passwordStrength(String str) {
        char prev='a';
        int score=0; 
        HashSet<Character> seen=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(seen.contains(cur)) continue;
            if(cur>='a' && cur<='z')  score++;
            else if(cur>='A' && cur<='Z') score+=2;
            else if(cur>='0' && cur<='9') score+=3;
            else score+=5;
            seen.add(cur);
        }
        return score;
    }
}©leetcode
