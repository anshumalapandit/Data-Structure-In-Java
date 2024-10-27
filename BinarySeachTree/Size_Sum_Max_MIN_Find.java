public static int size(Node node) {
    if (node == null) return 0;
    int leftSize = size(node.left);
    int rightSize = size(node.right);
    
    return leftSize + rightSize + 1;
    
  }

  public static int sum(Node node) {
    if (node == null) return 0;
    int leftSum = sum(node.left);
    int rightSum = sum(node.right);
    
    return leftSum + rightSum + node.data;
  }

  public static int max(Node node) {
    if (node == null) return Integer.MIN_VALUE;
    
    if (node.left == null && node.right == null) {
      return node.data;
    }
    
    return max(node.right);
  }

  public static int min(Node node) {
    if (node == null) return Integer.MAX_VALUE;
    
    if (node.left == null && node.right == null) {
      return node.data;
    }
    
    return min(node.left);
  }

  public static boolean find(Node node, int data) {
      if (node == null) return false;
    
      if (node.data == data) {
        return true;
      }
    
      if (node.data < data) {
        return find(node.right, data);
      } else {
        return find(node.left, data);
      }
  }  
