class Solution {
  // hey attention : list may be very large dont try to convert into string then int long ot any
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        Node temp1=first;
        Node temp2=second;
        long num1=0;
        long num2=0;
        long MOD = 1000000007; // its is mention in the question to take input 10 raise to 9+7 mtlb 9 zero+7
        while(temp1!=null){
            num1=(num1*10+temp1.data)%MOD;
            temp1=temp1.next;
        }
        while(temp2!=null){
            num2=(num2*10+temp2.data)%MOD;
            temp2=temp2.next;
        }
        return (num1*num2)%MOD;
    }
}
