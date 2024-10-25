

public class Stackarray {
  int stackarray[];
  int maxsize;
  int top;
  Stackarray(int n){
	  maxsize=n;
	  stackarray=new int[maxsize];
	  top =-1;
  }
  //isEmpty
  public boolean isEmpty() {
	  return top==-1;
  }
  //isFull
  public boolean isFull() {
	  return top==maxsize-1;
  }
  //push
  public void push(int data) {
	 if(isFull()) {
		 System.out.println("can't pushed stack is full");
		 return;
	 }
	stackarray[++top]=data;
	 System.out.println("pushed "+data+"  from the stack.");
	 
  }
  //pop
  public int pop() {
	  if(isEmpty()) {
		  System.out.println("stack is empty!can't popped");
		  return -1;
	  }
	  int removed=stackarray[top--];
	  System.out.println("popped "+removed+"  from the stack.");
	  return removed;
  }
  //peek
  public int peek(){
	  if (isEmpty()) {
	      System.out.println("Stack is empty! No elements to peek.");
	      return -1;
	    }
	    return stackarray[top];
	  }
  //print
  public void print() {
	  if(isEmpty()) {
		  System.out.println("stack is empty");
         return;
	  }else {
		  System.out.println("Stack is: ");
		  //Using <= top instead of stackarray.length in the print() method ensures that 
		  //only the elements currently in the stack are printed. 
		  for(int i=0;i<=top;i++){
			  System.out.print(stackarray[i]+" ");
		  }
		  System.out.println();
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stackarray s=new Stackarray(5);
    System.out.println("initially stack element is: "+s.isEmpty());
    s.push(1);
    s.push(2);
    s.push(3);
   s.push(4);
    s.push(5);
    s.print();
    System.out.println("Top element in my stack is: "+s.peek());
    System.out.println("popped operation");
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.print();
	}

}
