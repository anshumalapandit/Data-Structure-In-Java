class Solution {
    public Node findMid(Node head){
        if(head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method
        Node mid=findMid(head);
        if(mid==null){
            return null;
        }
        Node prev=head;
        while(prev.next!=mid){
            prev=prev.next;
        }
        prev.next=mid.next;
        return head;
        
    }
}
