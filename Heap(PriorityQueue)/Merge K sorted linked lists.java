class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data-b.data);
        
           for(Node head:arr){
               if(head!=null)
               pq.add(head);
              
           }
        
       Node dummy=new Node(0);
       Node curr=dummy;
       while(pq.size()>0){
           Node minNode=pq.poll();
           curr.next=minNode;
           curr=curr.next;
           if(minNode.next!=null){
               pq.add(minNode.next);
           }
       }
       
        return dummy.next;
    }
}
