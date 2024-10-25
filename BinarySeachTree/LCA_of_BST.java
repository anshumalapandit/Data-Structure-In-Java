// what is LCA?
//So, the lowest common ancestor of two nodes in a tree is the nearest node that is an ancestor of both nodes.
//It’s like finding the closest family member who is a parent or grandparent to both people you're interested in.
public static Node lowestCommonAncestor( Node root,  Node p,  Node q) {
      if(root==null){
          return null;
      }
      if(p==null || q==null){
          return null;
      }
      if(p.data==root.data && q.data==root.data){
          return root;
      }
      if(p.data<root.data && q.data<root.data){
          return lowestCommonAncestor(root.left,p,q);
      }else if(p.data>root.data && q.data>root.data){
          return lowestCommonAncestor(root.right,p,q);
      }else{
          // naa root se chota hai na bada its means ki wo root hi hai so return root
          return root;
      }
  }
