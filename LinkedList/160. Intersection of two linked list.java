/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int find(ListNode node){
        int count=0;
        ListNode temp=node;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        int len1=find(headA);
        int len2=find(headB);
        int diff=Math.abs(len1-len2);
        ListNode t1=headA;
        ListNode t2=headB;
        if(len1>len2){
            for(int i=1;i<=diff;i++){
               t1=t1.next;
            }
        }else{
            for(int i=1;i<=diff;i++){
                t2=t2.next;
            }
        }
        // check for remaining
        while(t1!=null){
            if(t1==t2){ // remember in quest its is mention intersection of node means address dont check data
                return t1;
            }
            // if not equal
            t1=t1.next;
            t2=t2.next;
        }
        return null; // if not found intersection
    }
}
