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
