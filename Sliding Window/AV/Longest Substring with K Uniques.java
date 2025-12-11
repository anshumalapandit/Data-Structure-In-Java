class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=-1;
        while(j<s.length()){
            // calculations
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.size()<k){
                // first i will try to acheive no. of unique char atleasy
                j++;
            }else if(map.size()==k){
                // i acheived now i will find ans from the calculation
                // u have to calculate the length of substring not its count of letters
                // dont forget length of window=j-i+1;
                ans=Math.max(j-i+1,ans);
                // update the pointer 
                j++;
            }else if(map.size()>k){
                // if its happen we will never get our desired answer properly
                while(map.size()>k && i<=j){
                    char left=s.charAt(i);
                    int cnt=map.get(left);
                    if(cnt-1==0){
                        // if after dec by 1 ==0 then remove it no point of keeping it
                        map.remove(left);
                    }else{
                        //then again put it back dec by 1 karke why 1 re bcoz 
                        // we are moving 1 step na everytime window ko;
                        map.put(left,cnt-1);
                    }
                    i++;
                }
                j++; // bhai ye to hamesha karna hi hai .
                
            }
        }
        return ans;
    }
}
