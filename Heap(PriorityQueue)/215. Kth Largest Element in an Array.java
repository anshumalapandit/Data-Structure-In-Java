class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        int m=0;
        while(m<n-k){
            pq.remove();
            m++;
        }
       return m==n-k ? pq.remove() : 0;
}
}
