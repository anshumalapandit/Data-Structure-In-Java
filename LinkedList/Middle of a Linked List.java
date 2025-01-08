class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast.next!=null){
            slow=slow.next;
            if(fast.next.next!=null){
            fast=fast.next.next;
            }else{
            fast=fast.next;
            }
        }
        return slow.data;
    }
}
