class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> subq=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        int n=q.size()-k;
        while(q.size()!=n){
            s.push(q.poll());
        }
        //s.push(q.poll());
        while(s.size()>0){
            subq.add(s.pop());
        }
        while(q.size()>0){
            subq.add(q.poll());
        }
        return subq;
    }
}
