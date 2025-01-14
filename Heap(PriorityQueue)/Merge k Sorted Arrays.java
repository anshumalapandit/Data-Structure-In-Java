class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                pq.add(arr[i][j]);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(pq.size()>0){
            ans.add(pq.poll());
        }
        return ans;
        
    }
}
