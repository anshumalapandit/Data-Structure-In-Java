// Approach 1 : T.C= 0(R*C) S.C=> 0(R+C) due to row and col array
class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        //now i will iterate on this array which marked 1 we will convert that those col arr into 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
// approach 2:
// T.C=> 0(R*C) S.C=> 0(1) 

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean hasFirstRow = false;
        boolean hasFirstCol = false;
      // Check if the first row contains a zero
        for (int c = 0; c < matrix[0].length; c++) { // first row fixed
            if (matrix[0][c] == 0) {
                hasFirstRow = true;
                break;
            }
        }
      // Check if the first col contains a zero
        for (int r = 0; r < matrix.length; r++) { // first column fixed
            if (matrix[r][0] == 0) {
                hasFirstCol = true;
                break;
            }
        }
        for (int r = 1; r < matrix.length; r++) { // preprocessing
            for (int c = 1; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        for (int c = 1; c < matrix[0].length; c++) { // 1st row
            if (matrix[0][c] == 0) {
                nullifyCol(matrix, c);
            }
        }
        for (int r = 1; r < matrix.length; r++) { // first column
            if (matrix[r][0] == 0) {
                nullifyRow(matrix, r);
            }
        }
        if (hasFirstRow) nullifyRow(matrix, 0);
        if (hasFirstCol) nullifyCol(matrix, 0);
    }
    public void nullifyRow(int[][] matrix, int row) {
        for (int c = 0; c < matrix[0].length; c++) {
            matrix[row][c] = 0;
        }
    }
    public void nullifyCol(int[][] matrix, int col) {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r][col] = 0;
        }
    }
} // TC: O(R) + O(C) + O(R * C) + O(R * C), SC: O(1)
