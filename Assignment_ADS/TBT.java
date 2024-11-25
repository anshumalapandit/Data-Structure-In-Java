import java.util.*;
class Main{
    public static class Node{
        int data;
        Node left;
        Node right;
        boolean isLeftThreaded;
        boolean isRightThreaded;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            this.isLeftThreaded=true;
            this.isRightThreaded=true;
        }
    }
    public static Node root=null;
    public static void  insert(int data){
        Node newNode =new Node(data);
        if(root==null){
            root=newNode;
            return ;
        }
     Node  parent=null;
     Node current=root;
     while(current!=null){
         parent=current;
         if(data<current.data){
             // go to left
             if(!current.isLeftThreaded){
                 current=current.left;
             }else{
                 break;
             }
         }else{
             // go to right
             if(!current.isRightThreaded){
                 current=current.right;
             }else{
                 break;
             }
         }
     }
         // now update poniters and linking
         if(data<parent.data){
             // go to left
             newNode.left=parent.left;
             newNode.right=parent;
             parent.isLeftThreaded=false;
             parent.left=newNode;
         }else{
             newNode.right=parent.right;
             newNode.left=parent;
             parent.isRightThreaded=false;
             parent.right=newNode;
         }
     }
    public static void inorder(Node root){
     if(root==null){
         System.out.println("TBT is empty..");
         return;
     }   
     Node cur=leftmost(root);
     while(cur!=null){
         System.out.println(cur.data+" ");
         if(cur.isRightThreaded){
             cur=cur.right;
         }else{
             cur=leftmost(cur.right);
         }
     }
     System.out.println();
    }
    public static Node leftmost(Node root){
        if(root==null){
            return null;
        }
       Node cur=root;
        while(!cur.isLeftThreaded && cur.left!=null){
            cur=cur.left;
        }
        return cur;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n______Menu____");
            System.out.println("1. insertion");
            System.out.println("2. Display inorder traversal");
            System.out.println("3. Exiting..");
            System.out.println("Enter your choice..");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter data to insert: ");
                    int data=sc.nextInt();
                    insert(data);
                    break;
                case 2:
                    System.out.println("Inorder traversal of TBT:");
                    inorder(root);
                    break;
                case 3:
                    System.out.println("Exiting...Have a Nice day");
                    return;
                default:
                System.out.println("Invalid choice..Please Try again");
            }
        }
    }
}
