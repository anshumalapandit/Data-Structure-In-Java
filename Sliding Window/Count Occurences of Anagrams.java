class Solution {

    int search(String pat, String txt) {
        // code here
        if(pat.length()>txt.length()){
            return 0;
        }
        int tempFreq[]=new int[26];
        int freq[]=new int[26];
        int count=0;
        for(int i=0;i<pat.length();i++){
            tempFreq[txt.charAt(i)-'a']++;
            freq[pat.charAt(i)-'a']++;
        }
        if(Arrays.equals(tempFreq,freq)){
            count++;
        }
        // now check further
        int i=pat.length();
        int j=0;
        while(i<txt.length()){
            // removing freq of j adding i
            tempFreq[txt.charAt(j)-'a']--;
            tempFreq[txt.charAt(i)-'a']++;
            if(Arrays.equals(tempFreq,freq)){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}
