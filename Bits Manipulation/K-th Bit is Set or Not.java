class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        // n or k ke bich & operating karlo if ans >0 true but left shift k by 1
        //return (n&(1<<k))>0;
        // also we can do with right shift
        return ((n>>k)&1)==1;
    }
}
