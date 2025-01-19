/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node){
        while(node.next.next!=null){
             // replace its value with adjacent
             node.val=node.next.val;
             node=node.next;
        }
      // for last second node
        node.val=node.next.val;
      // making it null coz otherwise last 2 node will contains same value and in quest specifies unique elem must
        node.next=null;
    }
}
