//package Non-recursive;
import java.util.Stack;

//import org.w3c.dom.Node;
public class Inorder {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left=null;
            this.data=data;
            this.right=null;
        }
    }
    public static int idx=-1;
    public  Node buildTree(int nodes[]){
      idx++;
      if(nodes[idx]==-1){
        return null;
      }
    Node newNode=new Node(nodes[idx]);
    newNode.left=buildTree(nodes);
    newNode.right=buildTree(nodes);
    return newNode;
    }
    public void inorder(Node root){
       
        Stack<Node> s=new Stack<>();
        Node current=root;
        while(!s.isEmpty() || current!=null){
            //to the leftmost part
            while(current!=null){
           s.push(current);
           current=current.left;
           
            }
            current=s.pop();
            System.out.print(current.data+" ");
            //right part-call
            current=current.right;

        }
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        //pehle rooot print hota hai..
        Stack<Node> s=new Stack<>();
        //root push
        s.push(root);
        while(!s.isEmpty()){
            Node current=s.pop();
            System.out.print(current.data+" ");
            //push right child first so that left is processed first
            if(current.right!=null){
                s.push(current.right);
            }
            if(current.left!=null){
                s.push(current.left);
            }
        }
        
        
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
     Stack<Node> stack1 = new Stack<>();
    //S1==> Used to help traverse the tree and store nodes in a modified preorder fashion (root, right, left).
        Stack<Node> stack2 = new Stack<>();
    // Used to reverse the order of nodes from stack1, resulting in a correct postorder (left, right, root).
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            //push current node of S1 into stack2
            stack2.push(current);
            //push current node k left ko in stack1
            if (current.left != null) {
                stack1.push(current.left);
            }
            //push current node k right ko in stack1
            if (current.right != null) {
                stack1.push(current.right);
            }
        }
        //now it will reverse result;
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
        
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,-1,3,5,-1,-1,6,-1,-1};
        Inorder i=new Inorder();
        Node root=i.buildTree(nodes);
        System.out.println("root is " +root.data);
        System.out.println("Inorder Traversal : ");
        i.inorder(root);
        System.out.println("\nPreorder traversal: ");
        i.preorder(root);
        System.out.println("\nPostorder Traversal: ");
        i.postorder(root);

    }
}

