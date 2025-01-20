class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node dZ=new Node(-1);
        Node dO=new Node(-1);
        Node dT=new Node(-1);
        Node d1=dZ;
        Node d2=dO;
        Node d3=dT;
        Node cur=head;
        while(cur!=null){
            if(cur.data==0){
                d1.next=cur;
                d1=d1.next;
            }else if(cur.data==1){
                d2.next=cur;
                d2=d2.next;
            }else{
                d3.next=cur;
                d3=d3.next;
            }
            cur=cur.next;
        }
        if(dO.next!=null){
        d1.next=dO.next;
        }else{
            d1.next=dT.next;
        }
        d2.next=dT.next;
        d3.next=null;
        return dZ.next;
    }
}
