class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int idx=0;
        while(pq.size()>0){
            arr[idx]=pq.poll();
            idx++;
        }
    }
}
