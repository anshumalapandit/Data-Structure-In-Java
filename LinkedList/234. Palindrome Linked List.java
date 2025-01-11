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
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while( fast.next!=null && fast.next.next!=null ){
           slow=slow.next;
           fast=fast.next.next;
        }
        return slow;
    }
    public ListNode Reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode mid=findMid(head);
        ListNode temp=mid.next;
        mid.next=null;
       temp= Reverse(temp);
       ListNode l1=head;
       while(l1!=null && temp!=null ){
        if(l1.val!=temp.val){
            return false;
        }
        l1=l1.next;
        temp=temp.next;
       }
       return true;
    }
}
