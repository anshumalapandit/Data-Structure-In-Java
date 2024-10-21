public static int max(Node root) {
	if(root==null) {
		return Integer.MIN_VALUE;
	}
	int leftmax=max(root.left);
	int rightmax=max(root.right);
	int ans=Math.max(root.data,Math.max(leftmax, rightmax));
	return ans;
}
public static int min(Node root) {
	if(root==null) {
		return Integer.MAX_VALUE;
	}
	int leftmin=min(root.left);
	int rightmin=min(root.right);
	int ans=Math.min(root.data,Math.min(leftmin,rightmin));
	return ans;
}
