class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        // code here 
        // total possible diagonals hote hai if size N
        // 2N-1 is total diagonal
        ArrayList<Integer> ans=new ArrayList<>();
        int TD=(2*N)-1;
        for(int i=0;i<TD;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    // we know antidoagonal pe row idx and col idx ka sum diagonal k barabar hota hai
                    if(j+k==i){
                        ans.add(A[j][k]);
                    }
                }
            }
        }
        return ans;
    }
}
class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        // code here 
        // total possible diagonals hote hai if size N
        // 2N-1 is total diagonal
        ArrayList<Integer> ans=new ArrayList<>();
       // print first half
       for(int i=0;i<N;i++){
           int row=0;
           int col=i; // notice - jo i hai wahi se col bhi start hora
           while(col>=0){
               ans.add(A[row][col]);
               row++;
               col--;
           }
       }
       // now print lower halh
       for(int i=1;i<N;i++){
           int row=i;
           int col=N-1;
           while(row<N){
               ans.add(A[row][col]);
               row++;
               col--;
           }
       }
        return ans;
    }
}
