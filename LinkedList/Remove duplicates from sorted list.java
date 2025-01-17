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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dN=new ListNode(-101);
        ListNode d=dN;
        ListNode temp=head;
        while(temp!=null){
            while(temp!=null && temp.val ==d.val) temp=temp.next;

            d.next=temp;
            d=d.next;
            // before updating d just check temp should be not null
            if(temp!=null){
                temp=temp.next;
            }
        }
        return dN.next;
    }
}
