//Approach (Using Dijkstra's Algorithm)
//T.C : O(mn log(mn))
//S.C : O(mn)
import java.util.*;

class Solution {
    // bottom, top, right,left
    private static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static class Cell {
        int time, row, col;

        Cell(int time, int row, int col) {
            this.time = time;
            this.row = row;
            this.col = col;
        }
    }

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;

        int[][] result = new int[m][n]; // new array
        for (int[] row : result) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<Cell> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.time,b.time));
        result[0][0] = 0; // 0 
        pq.offer(new Cell(0, 0, 0)); 

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();

            if (curr.row == m - 1 && curr.col == n - 1) {
                return curr.time;
            }

            for (int[] dir : directions) {
                int newRow = curr.row + dir[0]; // top, right,left
                int newCol = curr.col + dir[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                    int moveCost = 1; 
                    int wait = Math.max(moveTime[newRow][newCol] - curr.time, 0); // 9 -7 = 2
                    int arrivalTime = curr.time + wait + moveCost;
                 // relaxation step , if my current arrival time is less than existing 
                    if (result[newRow][newCol] > arrivalTime) {
                        result[newRow][newCol] = arrivalTime;
                        pq.offer(new Cell(arrivalTime, newRow, newCol));
                    }
                }
            }
        }

        return -1;
    }
}
