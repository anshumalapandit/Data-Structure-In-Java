class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Queue<Integer> ans=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        while(queue.size()>0){
            s.push(queue.poll());
        }
        while(s.size()>0){
            ans.add(s.pop());
        }
        return ans;
    }
}
