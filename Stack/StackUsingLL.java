
  public class StackLL {
	  class Node{
		  int data;
		  Node next;
		  Node(int data){
			  this.data=data;
			  this.next=null;
		  }
	  }
	  public static Node head=null;
	  //isEmpty
	  public boolean isEmpty() {
		  return head==null;
	  }
	  //push
	  public void push(int data) {
		  Node newNode=new Node(data);
		  if(isEmpty()) {
			  head=newNode;
		  }else {
		  newNode.next=head;
		  head=newNode;
		  }
		  System.out.println("pushed "+data+"  on the stack.");
	  }
	  
	  //pop
	  public int pop() {
		  if(isEmpty()) {
			  System.out.println("stack is empty ! cant popped.");
			  return -1;
		  }
		  int removedvalue=head.data;
		  head=head.next;
		  System.out.println("popped "+removedvalue+" from the stack.");
		  return removedvalue;
	  }
	  //peek
	  public int peek() {
		  if(isEmpty()) {
			  System.out.println("cant peeked! bcoz stack is empty.");
			  return -1;
		  }
		  return head.data;
	  }
	  //print
	  public void printstack() {
		  if(isEmpty()) {
			  System.out.println("stack is empty! can't print");
			  return;
		  }else {
			 System.out.println("Stack is: ");
		  Node temp=head;
		  while(temp!=null) {
			  System.out.print(temp.data+" ");
			  temp=temp.next;
		  }
		  System.out.println();
	  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StackLL s=new StackLL();
    System.out.println("is my stack initially empty? "+s.isEmpty());
    s.push(2);
    s.push(4);
    s.push(6);
    s.push(8);
    s.push(10);
    s.printstack();
    System.out.println("my top element in stack is: "+s.peek());
    System.out.println("Popped Operation: ");
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.printstack();
    
	}

}
