class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            sb.reverse();
            if(i!=arr.length-1)
            ans.append(sb+" ");
            else
            ans.append(sb);
        }
        return ans.toString();
    }
}
