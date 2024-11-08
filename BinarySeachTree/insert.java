public static Node insert(Node root,int val) {
	if(root==null) {
		root=new Node(val);
		return root;
	}
	if(root.data>val) {
		root.left=insert(root.left,val);
	}else {
		//if value greater than root go to right
		root.right=insert(root.right,val);
	}
	return root; //root hi return krna hai..
}
