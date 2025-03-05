class Solution {
    public long coloredCells(int n) {
        long totalBlue=1;
        int i=0;
        long touchedCell=4;
        while(i<n-1){
            totalBlue+=touchedCell;
            touchedCell+=4;
            i++;
        }
        return totalBlue;
    }
}
