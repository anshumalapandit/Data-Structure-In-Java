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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=new ListNode(-1); // fake head
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode cur=newHead;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
            cur.next=p1;
            cur=cur.next;
            p1=p1.next;
        }else{
                cur.next=p2;
                cur=cur.next;
                p2=p2.next;
            }
        }
        // now check for remaing element
        if(p1!=null){
            cur.next=p1;
        }
        if(p2!=null){
            cur.next=p2;
        }
        // we will return newhead.next bcoz our newHead is fake which is -1
        return newHead.next;
    }
}
