class Solution {
   
    public Node rotate(Node head, int k) {
        // add code here
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int size = 1;
       Node cur=head;
        // Find the length of linked list
        while (cur.next != null) {
            cur = cur.next;
            size += 1;
        }
         k %= size;
        if(k==0){
            return head;
        }
        
        cur.next=head;
        cur=head;
        for(int i=1;i<k;i++)
            cur=cur.next;
        
            head=cur.next;
            cur.next=null;
            return head;
        }
    }
