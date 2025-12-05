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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode d=dummy;
        int carry=0;
        while(p1!=null || p2!=null){
            int v1=p1!=null ? p1.val: 0;
            int v2=p2!=null ? p2.val:0;
            int sum=carry+v1+v2;
            carry=sum/10;
            d.next=new ListNode(sum%10);
            d=d.next;
        p1=p1==null? null : p1.next;
        p2=p2==null? null: p2.next;
        }
       if(carry==1){
        d.next=new ListNode(carry);
        d=d.next;
       }
       return dummy.next;
    }
}
