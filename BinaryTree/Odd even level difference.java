class Solution
{
	int getLevelDiff(Node root)
	{
	    //code here
	    if(root==null){
	        return 0;
	    }
	    Queue<Node> q=new LinkedList<>();
	    q.add(root);
	    int level=0; // even
	    int curOddSum=0;
	    int curEvenSum=0;
	    while(q.size()>0){
	        int size=q.size();
	        for(int i=0;i<size;i++){
	            Node cur=q.remove();
	            if(level%2==0){
	                curEvenSum+=cur.data;
	            }else{
	                curOddSum+=cur.data;
	            }
	            if(cur.left!=null){
	                q.add(cur.left);
	            }
	            if(cur.right!=null){
	                q.add(cur.right);
	            }
	        }
	        level++;
	    }
	    return curEvenSum-curOddSum;
	}
}
