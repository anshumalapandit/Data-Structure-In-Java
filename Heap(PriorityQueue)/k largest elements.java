class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> kLargest(int arr[], int k) {
        // write code here
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int notWant=arr.length-k;
        for(int i=0;i<notWant;i++){
            pq.poll();
        }
        // add remaining elemnt into ans
        while(pq.size()>0){
            ans.add(pq.poll());
        }
        List<Integer> F=new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
            F.add(ans.get(i));
        }
        return F;
    }
