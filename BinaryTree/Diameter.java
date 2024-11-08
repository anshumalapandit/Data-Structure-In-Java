// diameter = no. of nodes in a longest path between 2 leaves
// diameter = can be go through root also it can be lies in any subtree
// approach 1 0(n2)
//For the diameter to be correct when the height is calculated in terms of edges,
//you need to ensure that the height function also returns the height in terms of edges.
public static int diameter(Node root) {
	if(root==null) {
		return 0;
	}
	int leftdia=diameter(root.left);
	int rightdia=diameter(root.right);
	int leftht=height(root.left); // called height fxn
	int rightht=height(root.right);
	int selfdia=leftht+rightht; 
	return Math.max(selfdia, Math.max(leftdia, rightdia));
}
// approach 2 0(N) coz we are not calling height fxn recursively
class info{
  int dia;
  int ht;
  public info(int dia,int ht){
    this.dia=dia;
    this.ht=ht;
  }
}
public static info diameter(Node root){
  if(root==null){
  return new info(0,0); 
}
info leftinfo=diameter(root.left);
info rightinfo=diameter(root.right);
int dia=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
//also we can calculate height here
int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
return new info(dia,ht);
}
