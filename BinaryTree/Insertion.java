import java.util.LinkedList;

public class createBT {
public static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public static int idx=-1;
public static Node create(int nodes[]) {
	idx++;
	if(nodes[idx]==-1) {
		return null;
	}
	Node newNode=new Node(nodes[idx]);
	newNode.left=create(nodes);
	newNode.right=create(nodes);
	return newNode;
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is preorder sequence
      int nodes[]= {8,2,4,-1,-1,5,-1,-1,3,-1,-1};
      Node root=create(nodes);
      System.out.println("Here is my root: "+root.data);
 }
}
