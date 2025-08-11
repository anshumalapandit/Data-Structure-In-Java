class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word:words){
           // ad
           boolean flag=true;
           for(int i=0;i<word.length();i++){
              if(allowed.indexOf(word.charAt(i))!=-1){
                // it is allowed good to go
                continue;
              }else{
                // not allowed means some different char cames
                flag=false;
              }
           }
           if(flag)
           count++;
        }
        return count;
    }
}
