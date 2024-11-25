package ADS;
import java.util.*;
public class Assign1 {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
  public static Node head;
  public boolean isEmpty() {
	  return head==null;
  }
  public void insert(int data) {
	  Node newNode=new Node(data);
	  if(isEmpty()) {
		  head=newNode;
	  }else {
	  newNode.next=head;
	  head=newNode;
	  }
	//  System.out.println("Data "+data+" pushed into the stack.");
  }
  public int delete() {
	  if(isEmpty()) {
		  System.out.println("Stack is in underFlow!");
		  return -1;
	  }
	  int poppedValue=head.data;
	  head=head.next;
	  if(head==null) {
		  head=null;
	  }
	  return poppedValue;
  }
  public void modify(int oldData ,int newData) {
	  if(isEmpty()) {
		  System.out.println("Stack is empty ! cant modify..");
		  return;
	  }
	  Node temp=head;
	  while(temp!=null) {
		  if(temp.data==oldData) {
			  temp.data=newData;
			  System.out.println(oldData+" is modified to "+newData);
			  return;
		  }
		  temp=temp.next;
	  }
	  System.out.println("OldData"+oldData+" not found in the stack.");
  }
  public boolean search(int key) {
	  if(isEmpty()) {
		  System.out.println("stack is empty! Searching not possible");
		  return false;
	  }
	  Node temp=head;
	  while(temp!=null) {
		  if(temp.data==key) {
			  return true;
		  }
		  temp=temp.next;
	  }
	  return false;
	  
  }
  public void print(Node head) {
	  if(isEmpty()) {
		  System.out.println("Stack is empty! cant print.");
	  }else {
		  Node temp=head;
		  System.out.println("My stack is: ");
		  while(temp!=null) {
			  System.out.print(temp.data+" ");
			  temp=temp.next;
		  }
		  System.out.println();
	  }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Assign1 s=new Assign1();
    Scanner sc=new Scanner(System.in);
    System.out.println("is my stack initially empty: "+s.isEmpty());
    while (true) {
        System.out.println("\nChoose operation:");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Modify");
        System.out.println("4. Search");
        System.out.println("5. Print");
        System.out.println("6. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter value to insert:");
                int value = sc.nextInt();
                s.insert(value);
                break;
            case 2:
                System.out.println("Deleted " + s.delete());
                break;
            case 3:
                System.out.println("Enter old value and new value to modify:");
                int oldData = sc.nextInt();
                int newData = sc.nextInt();
                s.modify(oldData, newData);
                break;
            case 4:
                System.out.println("Enter value to search:");
                int key = sc.nextInt();
                System.out.println("Is my key found: " + s.search(key));
                break;
            case 5:
                s.print(head);
                break;
            case 6:
                System.out.println("Exiting...");
                // remember to close the scanner object
                sc.close(); 
                return; // sirf case 6 mai return statement ..return from while loop
                // remember default option
            default:
                System.out.println("Invalid choice! Please choose again.");
                break;
        }
    }
}

}

