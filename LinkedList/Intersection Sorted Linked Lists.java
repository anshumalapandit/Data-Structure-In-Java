class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node cur1=head1;
        Node cur2=head2;
        Node newNode=new Node(0);
        Node temp=newNode;
        while(cur1!=null && cur2!=null){
            if(cur1.data==cur2.data){
                temp.next=new Node(cur1.data);
                temp=temp.next;
                cur1=cur1.next;
                cur2=cur2.next;
            }else if(cur1.data<cur2.data){
                cur1=cur1.next;
            }else{
                cur2=cur2.next;
            }
        }
        
        return newNode.next;
        
    }
}
