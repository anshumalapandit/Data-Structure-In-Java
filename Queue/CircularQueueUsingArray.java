
public class CircularQueue {
int arr[];
int size;
int rear;
int front;
CircularQueue(int n){
	size=n;
	arr=new int[size];
	rear=-1;
	front=-1;
}
//isempty
public boolean isEmpty() {
	return rear==-1 && front ==-1;
}
//isfull
public boolean isFull() {
	//after last positiion we have to come at first pos
	return (rear+1)%size==front;
}
//add
public void add(int data) {
	if(isFull()) {
		System.out.println("Circular Queue is in overflow.");
		return;
	}
	//if i want to add at first element
	if(front ==-1) {
		front=0;
	}
	rear=(rear+1)%size;
	arr[rear]=data;
	
}
//remove
public int remove() {
	if(isEmpty()) {
		System.out.println("Circular queue is empty now!");
		return -1;
	}
	//Storing b4 removing
	int removed =arr[front];
	if(rear==front) {
		rear=front=-1;
	} else {
		front=(front+1)%size;
	}
	return removed;
}
//peek
public int peek() {
	if(isEmpty()) {
		System.out.println("it is empty now cant peek");
		return -1;
	}
	return arr[front];
}
//Display the contents of the queue
public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty, cannot display.");
        return;
    }
    System.out.print("Queue: ");
    // Use a for loop to traverse from front to rear
    for (int i = front; ; i = (i + 1) % size) {
    //The continuation condition is omitted (i.e., ; ;) since you will break out of the loop when reaching rear.
        System.out.print(arr[i] + " ");
        if (i == rear) break; // Breaks the loop when the last element is reached
    }
    System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   CircularQueue cq=new CircularQueue(5);
   System.out.println("Is my Circular queue initially empty? " + cq.isEmpty());
   cq.add(1);
   cq.add(2);
   cq.add(3);
   cq.add(4);
   cq.display();
   System.out.println("Performing dequeue operations:");
   System.out.println(cq.remove());
   System.out.println(cq.remove());
   cq.display();
   cq.add(5);
   cq.add(6);
   cq.display();
   System.out.println("Displaying all elements:");
   while(!cq.isEmpty()) {
	   System.out.println(cq.peek());
	   cq.remove();
   }
   System.out.println();
	}

}
