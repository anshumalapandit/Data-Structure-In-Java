// Time Complexity Analysis
//The time complexity is O(h), where h is the height of the tree.
//In a balanced BST, this will be O(log n), but in a skewed tree, it could be O(n).
//The space complexity is O(h) due to the recursive call stack, where h is the height of the tree.
public static Node searchBST(Node root, int val) {
    if(root==null){
        return null;
    }
      if(root.data==val){
          return root;
      }
      if(root.data>val){
          return searchBST(root.left,val);
      }else{
          return searchBST(root.right,val);
      }

  }
