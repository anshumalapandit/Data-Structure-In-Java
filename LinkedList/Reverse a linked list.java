class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
