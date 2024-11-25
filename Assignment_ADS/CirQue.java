import java.util.Scanner;

class CircularQueue {
    String[] cirArr;
    int maxSize;
    int front;
    int rear;

    // Constructor
    CircularQueue(int size) {
        maxSize = size;
        cirArr = new String[maxSize];
        front = -1;
        rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    // Add an element to the queue
    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Circular Queue is full. Cannot add more items.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % maxSize;
        cirArr[rear] = data;
    }

    // Remove and return the front element of the queue
    public String dequeue() {
        if (isEmpty()) {
            return "Circular Queue is empty. Nothing to remove.";
        }
        String removedValue = cirArr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }
        return removedValue;
    }

    // View the front element without removing
    public String peek() {
        if (isEmpty()) {
            return "Queue is empty. Please place an order.";
        }
        return cirArr[front];
    }

    // Display all elements in the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.print("Orders in the queue: ");
        for (int i = front; i != rear; i = (i + 1) % maxSize) {
            System.out.print(cirArr[i] + " ");
        }
        System.out.println(cirArr[rear]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue queue = new CircularQueue(5);
        final int PRICE_PER_ITEM = 100;
        int orderCount = 0;

        while (true) {
            System.out.println("\n================= Menu =================");
            System.out.println("1. Place an order");
            System.out.println("2. View next order");
            System.out.println("3. Cancel an order");
            System.out.println("4. Display all orders");
            System.out.println("5. Calculate bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your item: ");
                    String order = sc.nextLine();
                    queue.enqueue(order);
                    orderCount++;
                    System.out.println("Order placed successfully.");
                    break;

                case 2:
                    System.out.println("Next order: " + queue.peek());
                    break;

                case 3:
                    System.out.println("Order cancelled: " + queue.dequeue());
                    if (!queue.isEmpty()) orderCount--;
                    break;

                case 4:
                    queue.printQueue();
                    break;

                case 5:
                    System.out.println("Total bill: $" + (orderCount * PRICE_PER_ITEM));
                    break;

                case 6:
                    System.out.println("Exiting. Have a great day!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
