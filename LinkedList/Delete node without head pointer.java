/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       
        ListNode l1=node;
        while(l1.next.next!=null){
            l1.val=l1.next.val;
            l1=l1.next;
        }
        // last node k liye
        l1.val=l1.next.val;
        l1.next=null;
    }
}
