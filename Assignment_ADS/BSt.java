package assignment;
import java.util.*;
public class BST {
public static class Node{
	int phon;
	String name;
	Node left;
	Node right;
	Node(int phon ,String name){
		this.phon=phon;
		this.name=name;
		this.left=null;
		this.right=null;
	}
}
public static Node root=null;
public static void insert(int phon,String name) {
	root= insertRecursive(root,phon,name);
}
public static Node insertRecursive(Node root,int phon,String name) {
	if(root==null) {
		return new Node(phon,name);
	}
	if(phon<root.phon) {
		// go to left
		root.left=insertRecursive(root.left,phon,name);
	}else if(phon>root.phon) {
		// go to right
		root.right=insertRecursive(root.right,phon,name);
	}
	return root;
}
public static void update(int oldPhon,int newPhon,String newName) {
	// 1st delete old name
	delete(oldPhon);
	// then insert newPhon,newName
	insert(newPhon,newName);
}
public static void delete(int phon) {
	root=deleteRecursive(root,phon);
}
public static Node deleteRecursive(Node root,int phon) {
	if(root==null) {
		return null;
	}
	if(phon<root.phon) {
		// go to left
		root.left=deleteRecursive(root.left,phon);
	}else if(phon>root.phon) {
		// go to right
		root.right=deleteRecursive(root.right,phon);
	}else {
		// found
		// case 1
		if(root.left==null && root.right==null) {
			return null;
		}
		// case 2
		if(root.left==null) {
			return root.right;
		}else if(root.right==null) {
			return root.left;
		}
		// case 3
		// find smallest node in leftmost side of right subtree
		Node small=findSmallest(root.right);
		root.phon=small.phon;
		root.right=deleteRecursive(root.right,small.phon);
		
	}
	return root;
}
public static Node findSmallest(Node root) {
	Node cur=root;
	while(cur.left!=null) {
		cur=cur.left;
	}
	return cur;
}
public static boolean search(int phon) {
	return searchRecursive(root,phon);
}
public static boolean searchRecursive(Node root,int phon) {
	if(root==null) {
		return false;
	}
	if(phon==root.phon) {
		return true;
	}
	if(phon<root.phon) {
		return searchRecursive(root.left,phon);
	}else  {
		return searchRecursive(root.right,phon);
	}
}
public static void display() {
	printinoder(root);
}
public static void printinoder(Node root) {
	if(root==null) {
		return;
	}
	printinoder(root.left);
	System.out.println("Phone: "+root.phon+" Name: "+root.name);
	printinoder(root.right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   while(true) {
	   System.out.println("\n___Menu___");
	   System.out.println("1. insert contact");
	   System.out.println("2. search contact");
	   System.out.println("3. delete contact");
	   System.out.println("4. Update contact");
	   System.out.println("5. Display Contact");
	   System.out.println("6. Exit..");
	   System.out.println("Enter Your Choice: ");
	   int choice=sc.nextInt();
	   switch(choice) {
	   case 1:
		   System.out.println("Enter Your phon number: ");
		   int phon=sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter Your Name: ");
		   String name=sc.nextLine();
		   insert(phon,name);
		   break;
	   case 2:
		   System.out.println("Enter your phon number: ");
		   int key=sc.nextInt();
		   System.out.println("Is my "+key+" Found? "+search(key));
		   break;
	   case 3:
		   System.out.println("Enter Your phon number  u want to delete: ");
		   int dltKey=sc.nextInt();
		   delete(dltKey);
		   break;
	   case 4:
		   System.out.println("Enter your oldNumber: ");
		   int oldNum=sc.nextInt();
		   System.out.println("Enter Your NewNumber: ");
		   int newNum=sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter new Name: ");
		   String newName=sc.nextLine();
		   update(oldNum,newNum,newName);
		   break;
	   case 5:
		   System.out.println("Displaying All contact: ");
		   display();
		   break;
	   case 6:
		   System.out.println("Exiting..");
		   return;
	   default:
		   System.out.println("Invalid choice ..please try again....!!");
		   break;
	   }
   }
	}

}
