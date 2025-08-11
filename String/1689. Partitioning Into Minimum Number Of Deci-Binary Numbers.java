class Solution {
    public int minPartitions(String n) {
        int ans=0;
        // u have to find simply largest number in the string
        // observe the test cases
        for(int i=0;i<n.length();i++){
            char x=n.charAt(i);
            int cur=x-'0'; // convert into actual number // '0'=48 , 
            ans=Math.max(cur,ans);
        }
        return ans;
    }
}
