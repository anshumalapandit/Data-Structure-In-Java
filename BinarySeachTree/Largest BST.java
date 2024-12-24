class Solution{
    public static class info{
        boolean isValid;
        int size;
        int min;
        int max;
        info(boolean isValid,int size,int min,int max){
            this.isValid=isValid;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBst=0;
    public static info helper(Node root){
         if(root==null){
            return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info leftinfo=helper(root.left);
        info rightinfo=helper(root.right);
        // self info
        int size=leftinfo.size+rightinfo.size+1;
       int  min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
        // if(root.data<leftinfo.max || root.data>rightinfo.max){
        //     return new info(false,size,min,max);
        // }
        if(leftinfo.isValid && rightinfo.isValid && root.data>leftinfo.max && root.data<rightinfo.min){
    
            maxBst=Math.max(maxBst,size);
            return new info(true,size,min,max);
        }
            
        return new info(false,size,min,max);
        
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
     maxBst=0;
       helper(root);
        return maxBst;
       
    }
    
}
