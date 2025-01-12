class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.size()==0){
	        return -1;
	    }
	    while(q1.size()!=1){
	        q2.add(q1.poll());
	    }
	    int rem=q1.poll();
	    // now add remainig element
	    while(q2.size()>0){
	        q1.add(q2.poll());
	    }
	    return rem;
    }
	
}

