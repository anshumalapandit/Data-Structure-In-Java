
public class Queueusingll {
    // Node class representing each element in the queue
    public class Node {
        int data; // Data part of the node
        Node next; // Pointer to the next node
        
        Node(int data) {
            this.data = data;
            this.next = null; // Initially, the next pointer is null
        }
    }

    // Head and tail pointers for the queue
    public Node head = null; // Points to the front of the queue
    public Node tail = null; // Points to the end of the queue

    // Check if the queue is empty
    public boolean isEmpty() {
        return head == null; // Only need to check head
    }

    // Enqueue operation to add an element
    public void enqueue(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = tail = newNode; // If the queue is empty, set head and tail to the new node
        } else {
            tail.next = newNode; // Link the new node at the end
            tail = newNode; // Update the tail reference
        }
        System.out.println("Enqueue " + data + " into the queue.");
    }

    // Dequeue operation to remove an element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue in underflow.");
            return -1; // Queue is empty
        }
        int removed = head.data; // Get the data from the head
        head = head.next; // Move the head pointer to the next node
        if (head == null) {
            tail = null; // Update tail when the queue becomes empty
        }
        System.out.println("Dequeue " + removed + " from the queue.");
        return removed;
    }

    // Print the queue elements
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Can't print.");
            return;
        }
        System.out.print("Queue is: ");
        Node temp = head; // Start from the head
        while (temp != null) {
            System.out.print(temp.data + " -> "); // Print each element
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the queue
    }

    public static void main(String[] args) {
        Queueusingll q = new Queueusingll(); // Create a new queue instance
        System.out.println("Is my Queue initially empty? " + q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.print(); // Print the current queue
        System.out.println("Deletion operation: ");
        q.dequeue(); // Perform dequeue operations
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue(); // Attempt to dequeue from an empty queue
        q.print(); // Print the current queue state
    }
}
