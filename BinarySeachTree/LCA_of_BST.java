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
