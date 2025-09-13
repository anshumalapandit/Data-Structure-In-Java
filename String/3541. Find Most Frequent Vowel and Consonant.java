class Solution {
    // public boolean isVowel(char ch){
    //     switch (ch) {
    //       case 'a' :
    //        return true;
    //        case 'e':
    //        return true;
    //        case 'i':
    //        return true;
    //        case 'o':
    //        return true;
    //        case 'u':
    //        return true;
    //     }
    //     return false;
    // }
    public int maxFreqSum(String s) {
        int vowel[]=new int[26];
        int consonant[]=new int[26];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowels.contains(ch)){
                vowel[ch-'a']++;
            }else{
                consonant[ch-'a']++;
            }
        }
        // finding max in vowel , consoant
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<vowel.length;i++){
            max1=Math.max(max1,vowel[i]);
            max2=Math.max(max2,consonant[i]);
        }
        return max1+max2;
    }
}
