package ADS;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign9 {

	// Method to add data to the min-heap
    public static void minadd(ArrayList<Integer> minHeap, int data) {
        minHeap.add(data); // Add data at the end of the heap
        int x = minHeap.size() - 1; // Get the index of the newly added element
        int par = (x - 1) / 2; // Get the parent index

        // Reheapify (bubble-up) to maintain the heap property for min-heap
        while (minHeap.get(x) < minHeap.get(par)) {
            int temp = minHeap.get(x);
            minHeap.set(x, minHeap.get(par));
            minHeap.set(par, temp);
            x = par; // Update the index of the child
            par = (x - 1) / 2; // Update the parent index
        }
    }
    // Method to peek the root (minimum element in min-heap)
    public static int minpeek(ArrayList<Integer> minHeap) {
        return minHeap.get(0); // Return the root (minimum value)
    }
    // Method to find the largest element in the min-heap
    public static int findMax(ArrayList<Integer> minHeap) {
        int max = Integer.MIN_VALUE;

        // Iterate through the entire heap to find the maximum
        for (int i = 0; i < minHeap.size(); i++) {
            if (minHeap.get(i) > max) {
                max = minHeap.get(i);
            }
        }

        return max;
    }
 // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two separate ArrayLists for the min-heap and max-heap
        ArrayList<Integer> minHeap = new ArrayList<>();
  

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Read the marks of students and add them to both heaps
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            minadd(minHeap, marks); // Add to the min-heap
        }

        // Find the minimum and maximum marks (root of the min-heap and max-heap)
        System.out.println("Minimum marks: " + minpeek(minHeap)); // In a min-heap, the root is the minimum element
        System.out.println("Maximum marks: " +findMax(minHeap) ); // In a max-heap, the root is the maximum element
        sc.close();
    }
}

