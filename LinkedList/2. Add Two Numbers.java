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
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode p1=h1;
        ListNode p2=h2;
        ListNode d=dummy;
        int carry=0;
        while(p1!=null && p2!=null){
            int sum=p1.val+p2.val;
            sum+=carry;
            int val=sum%10; // last digit
            carry=sum/10;
            d.next=new ListNode(val);
            d=d.next;
            p1=p1.next;
            p2=p2.next;
        }
        while(p1!=null && p2==null){
            int sum=p1.val;
            sum+=carry;
            int val=sum%10;
            carry=sum/10;
            d.next=new ListNode(val);
            d=d.next;
            p1=p1.next;
        }
        while(p1==null && p2!=null){
            int sum=p2.val;
            sum+=carry;
            int val=sum%10;
            carry=sum/10;
            d.next=new ListNode(val);
            d=d.next;
            p2=p2.next;
        }
        if(carry!=0){
            d.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
