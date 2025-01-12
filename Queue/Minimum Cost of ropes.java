class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sumRopes=0;
        while(pq.size()!=1){
            int n1=pq.poll();
            int n2=pq.poll();
            int sum=n1+n2;
            pq.add(sum);
            sumRopes+=sum;
        }
        return sumRopes;
    }
}
