/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dO=new ListNode(-1);
        ListNode dE=new ListNode(-1);
        ListNode d1=dO;
        ListNode d2=dE;
        int idx=1;
        ListNode temp=head;
        while(temp!=null){
            if(idx%2!=0){
                // its is odd
                d1.next=temp;
                d1=d1.next;
            }else{
                // its is even
                d2.next=temp;
                d2=d2.next;
            }
            idx++;
            temp=temp.next;
        }
        d2.next=null;
        d1.next=dE.next;
        d2.next=null;
        return dO.next;
    }
}
