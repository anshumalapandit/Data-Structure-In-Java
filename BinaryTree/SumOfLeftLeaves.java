public static int sumOfLeftLeaves(Node root) {
    if(root==null){
        return 0;
    }
     if(root.left!=null && root.left.left==null && root.left.right==null){
         return root.left.data+sumOfLeftLeaves(root.right);
     }
     int leftside=sumOfLeftLeaves(root.left);
     int rightside=sumOfLeftLeaves(root.right);
       return leftside+rightside;
   }
