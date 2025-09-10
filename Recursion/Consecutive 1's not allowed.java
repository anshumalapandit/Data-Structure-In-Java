// // User function Template for Java

// class Solution {
//     public void Helper(int n,int lastDigit,int count[]){
//         if(n==0){
//             count[0]++; // i got binary string
//             return;
//         }
//         Helper(n-1,0,count);
//         if(lastDigit==0){
//             Helper(n-1,1,count);
//         }
//     }
//     int countStrings(int n) {
//         // code here
//         int count[]=new int[1]; 
//         Helper(n,0,count);
//         return count[0];
//     }
// }
// DP solution:
class Solution {
    int countStrings(int n) {
        if (n == 1) return 2;
        if (n == 2) return 3;

        int a = 2; // countStrings(1)
        int b = 3; // countStrings(2)

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
