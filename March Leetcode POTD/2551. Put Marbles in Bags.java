class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int pairWeight[]=new int[n-1];
        for(int i=0;i<n-1;++i){
            pairWeight[i]=weights[i]+weights[i+1];
        }
        // we will sort the first element of the aaray
        Arrays.sort(pairWeight,0,n-1);
        // get the diff btw largest k-1 and smallest k-1 values
        long answer=0l;
        for(int i=0;i<k-1;++i){
            answer+=pairWeight[n-2-i]-pairWeight[i];
        }
        return answer;
    }
}
