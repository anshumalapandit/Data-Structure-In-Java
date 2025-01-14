class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code her
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                pq.add(mat[i][j]);
            }
        }
        int notWant=(n*n)-k;
        for(int i=0;i<notWant;i++){
            pq.poll();
        }
        return pq.poll();
    }
}
