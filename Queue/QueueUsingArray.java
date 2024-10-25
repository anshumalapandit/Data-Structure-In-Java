package QueueProject;

public class QueueusingArray {
    int maxsize;
    int queuearray[];
    int rear;
   int front;
    QueueusingArray(int size){
    	maxsize=size;
    	queuearray=new int[maxsize];
    	rear=-1;
      front=-1;
    }
    //isEmpty
    public boolean isEmpty() {
    	return front==-1 && rear==-1;
    }
    //isfull
    public boolean isFull() {
    	return rear==maxsize-1;
    }
    //add=enqueue
    public void enqueue(int data) {
    	if(isFull()) {
    		System.out.println("queue is in overflow,cannot add now");
    		return ;
    	}
    	if(front==-1) {
    		front=0;
    	}
    	queuearray[++rear]=data;
    	System.out.println("enqueue "+data+"  into the Queue");
    }
    //remove=dequeue
    public int dequeue(){
    	if(isEmpty()) {
    		System.out.println("Queue is in underflow, cant removed!");
    		return -1;
    	}
    	int removed=queuearray[front];
    	front=front+1;
    	if(front>rear) {
       // this conditon is used to determine whether the queue is empty after a series of dequeue operations.
    		rear=front=-1;
    	//when queue becomes empty
    	}
    	System.out.println("dequeue "+removed+"  from the queue");
    	return removed;
    }
    //display=0(n)
    public void display() {
    	if (isEmpty()) {
            System.out.println("Queue is empty cant display.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <=rear; i++) {
            System.out.print(queuearray[i] + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueusingArray q=new QueueusingArray(4);
       System.out.println("is my queue initially empty? "+q.isEmpty());
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       q.enqueue(5);
       q.display();
       System.out.println("delete operation : ");
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.display();
       }

}
