class Solution {
    public int helper(Node root,int level){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        Queue<Node > q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(q.size()>0){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                Node cur=q.remove();
                sum+=cur.data;
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            max=Math.max(sum,max);
        }
        return max;
    }
    public int maxLevelSum(Node root) {
        // add code here.
        return helper(root,0);
    }
}
