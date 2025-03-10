class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public long countOfSubstrings(String word, int k) {
        // lets calculate next consonant for every vowel so that we can use
        int n=word.length();
        int nextconst[]=new int[word.length()];
        int lastConstIdx=word.length();
        for(int i=n-1;i>=0;i--){
            nextconst[i]=lastConstIdx;
            if(!isVowel(word.charAt(i))){
                lastConstIdx=i;
            }
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        long count=0;
        int conso=0;
        // calculate the freq of vowel put into the map
        while(j<n){
            if(isVowel(word.charAt(j))){
                map.put(word.charAt(j),map.getOrDefault(word.charAt(j),0)+1);
            }else{
                // consonant 
                conso++;
            }
            // what if kisi point pe consonant>k ho gya? which is invalid to shrink karna start karo
        while(i<n && conso>k){
            // now shrin the window
            if(isVowel(word.charAt(i))){
                // cur word =vowel dec the window
                int freq=map.get(word.charAt(i));
                map.put(word.charAt(i),freq-1);
                // what if freq==0
                if(map.get(word.charAt(i))==0){
                    map.remove(word.charAt(i));
                }
            }else{
                conso--;
            }
            i++;
        }
        // now check ur ansh
        while(i<n && map.size()==5 && conso==k ){
          int idx=nextconst[j]; // next consonant ka idx
          count+=(idx-j);
          if(isVowel(word.charAt(i))){
            // cur word =vowel dec the window
                int freq=map.get(word.charAt(i));
                map.put(word.charAt(i),freq-1);
                // what if freq==0
                if(map.get(word.charAt(i))==0){
                    map.remove(word.charAt(i));
                }
          }else{
            conso--;
          }
          i++;
        }
        j++;
        }
        return count;
    }
}
