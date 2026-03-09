/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node cur=head;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(cur.next!=null){
            cur=cur.next;
        }
        Node temp2=cur;
        Node temp1=head;
        while(temp1!=null && temp2!=null && temp1.data<temp2.data){
            int cur1=temp1.data;
            int cur2=temp2.data;
            if(cur1+cur2==target){
                ArrayList<Integer> al=new ArrayList<>();
                al.add(cur1);
                al.add(cur2);
                ans.add(new ArrayList<>(al));
                temp1=temp1.next;
                temp2=temp2.prev;
            }else if(cur1+cur2>target){
                // need to decrease
                temp2=temp2.prev;
            }else{
                // <
                temp1=temp1.next;
            }
        }
        return ans;
    }
}
