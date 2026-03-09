/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head == null) return head;
        while(head.next!=null && head.data==head.next.data){
            head.next.prev=null;
            head=head.next;
        }
        Node temp=head;
        while(temp!=null){
            // prev value
            Node prevN=temp.prev;
            if(prevN!=null && prevN.data==temp.data){
                // delete temp
                Node nextNode = temp.next;
                prevN.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = prevN;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}
