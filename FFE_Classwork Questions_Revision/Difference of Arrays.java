import java.io.*;
import java.util.*;

public class Solution {
    public static void diffArray(int n1, int n2, int a1[], int a2[]) {
        int n = n2;
        int ans[] = new int[n];
      
        int i = n1 - 1, j = n2 - 1, k = n - 1, borrow = 0;
        
        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? a1[i] : 0;
            int digit2 = (j >= 0) ? a2[j] : 0;
            int diff = digit2 - digit1 - borrow;
        
            if (diff < 0) {
                diff = diff + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ans[k] = diff;
            i--;
            j--;
            k--;
        }
        
        int idx = 0;
        while (idx < n && ans[idx] == 0) {
            idx++;
        }
        
        // If idx reached the end, the result is 0
        if (idx == n) {
            System.out.println(0);
        } else {
            // Print the result array from the first non-zero digit
            for (int p = idx; p < n; p++) {
                System.out.println(ans[p]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        diffArray(n1, n2, a1, a2);
    }
}
