package ADS;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign10 {
public static void addMax(ArrayList<Integer> marks,int data) {
	// add at last index
	marks.add(data);
	// take index of x and par
	int x=marks.size()-1;
	int par=(x-1)/2;
	while(marks.get(par)<marks.get(x)) {
		// swap
		int temp=marks.get(x);
		marks.set(x, marks.get(par));
		marks.set(par, temp);
		// now update child and parent pointers
		x=par;
		par=(x-1)/2;
		
	}
}
	public  static boolean isEmpty(ArrayList<Integer> marks){
		return marks.size()==0;
	}
	public static int peek(ArrayList<Integer> marks) {
		return marks.get(0);
	}
	public static int findMin(ArrayList<Integer> marks) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<marks.size();i++) {
			if(marks.get(i)<min) {
				min=marks.get(i);
			}
		}
		return min;
	}
	public static void main(String args []) {
		ArrayList<Integer> marks =new ArrayList<>();
		System.out.println("Enter the number of students: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the marks of all "+n+" Students: ");
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			addMax(marks,data);
			}
		System.out.println("Maximum marks : "+ peek(marks));
		System.out.println("Minimum marks: "+findMin(marks));
	}
	
}
