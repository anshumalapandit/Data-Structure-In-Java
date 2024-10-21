public static int height(Node root){
  // height in term of node
  if(root==null){
  return 0;
}
Node lh=height(root.left);
Node rh=height(root.right);
return Math.max(lh,rh)+1; // adding 1 for root bcoz root is one level upper 
}
public static int height(Node root){
  // height in term of edges
  if(root==null){
  return -1;
}
Node lh=height(root.left);
Node rh=height(root.right);
return Math.max(lh,rh)+1; // adding 1 for root bcoz root is one level upper 
}
public static int Count(Node root){
  // count==size fxn
  if(root==null){
  return 0;
}
int leftcount=Count(root.left);
int rightCount=Count(root.right);
int ans=leftcount+rightCount+1; // adding 1 for root node count
return ans;
}
public static int sum(Node root){
  if(root==null){
  return 0;
}
int ls=sum(root.left);
int rs=sum(root.right);
int ans=ls+rs+root.data;
return ans;
}


