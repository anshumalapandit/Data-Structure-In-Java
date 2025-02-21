class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int sum=carry;
            int digit1=(i>=0)? a.charAt(i)-'0':0;
            int digit2=(j>=0)? b.charAt(j)-'0':0;
            sum+=digit1+digit2;
            int res=sum%2;
            sb.append(res);
            carry=sum/2;
            i--;
            j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
