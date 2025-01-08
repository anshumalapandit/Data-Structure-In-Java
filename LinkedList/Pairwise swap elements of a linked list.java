class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
       // A= head
       // B=head.next
       //C= head.next.next
       Node temp=head.next;
       head.next=pairwiseSwap(head.next.next);
       temp.next=head;
       return temp;
    }
}
