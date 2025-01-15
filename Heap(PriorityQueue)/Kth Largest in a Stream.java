class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
      
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int cur=arr[i];
            pq.add(cur);
            
            if(pq.size()>k){
                pq.poll();
            }
            if(pq.size()<k){
                ans[i]=-1;
            }else{
                ans[i]=pq.peek();
            }
        }
       
        return ans;
       
        
    }
}
