// T.C=> 0(logn) bcoz we are not travelling all node
class Tree {
    public static Node minInRightSide(Node root){
        if(root.left==null){
            return root;
        }
        return minInRightSide(root.left);
    }
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null){
            return null;
        }
        if(X<root.data){
            root.left=deleteNode(root.left,X);
        }else if(X>root.data){
            root.right=deleteNode(root.right,X);
        }else{
            // deleteing key is founf
           //case 1:
           if(root.left==null && root.right==null){
               return null;
           }
           // case 2:
           if(root.left==null){
               return root.right;
           }else if(root.right==null){
               return root.left;
           }
           // case 3:
           // find min node in right k leftmose node
           Node minNodeVal=minInRightSide(root.right);
           root.data=minNodeVal.data;
           root.right=deleteNode(root.right,minNodeVal.data);
          
        }
         return root;
                
    }
}
