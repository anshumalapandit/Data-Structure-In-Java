class Solution {
    public int atmost(String s,int k){
        int i=0;
        int j=0;
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            //add 
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            // what if k se jyada insert ho gya to , invalid ban jayega
            while(map.size()>k){
                // shrink karna padega
                // jo pehle insert kiya hai usko remove kar karke shrink karenge
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                // if uski freq==0 ho gyi no meaning of keeping it
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                // aage badho keep removing keep shrinking until <=k nhi ho jata
                i++;
            }
            // u came out of the loop means definitely <=k hua hoga
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
    public int countSubstr(String s, int k) {
        //  code here
        int ans=atmost(s,k)-atmost(s,k-1);
        return ans;
    }
}
