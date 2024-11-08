public static Node insert(Node root,int val) {
	if(root==null) {
		root=new Node(val);
		return root;
	}
	if(root.data>val) {
		// if value is less go to left subtree
		root.left=insert(root.left,val);
	}else {
		//if value greater than root go to right subtree
		root.right=insert(root.right,val);
	}
	return root; //return the updated root after insertion
}
