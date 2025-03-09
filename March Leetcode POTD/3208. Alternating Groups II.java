// brute force =tle error
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;
        if(k>n){
            return 0;
        }
    
        for(int i=0;i<colors.length;i++){
            boolean alternate=true;
            for(int j=0;j<k-1;j++){
                int curIdx=(i+j)%n;
                int nextIdx=(i+j+1)%n;
                if(colors[curIdx]==colors[nextIdx]){
                    alternate=false;
                    break;
                }
            }
            if(alternate){
                count++;
            }
        }
        return count;
    }
}
// optimised 
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int result=0;
        int n=colors.length;
        // length of current alternate sequence
        int alternateElementCount=1;
        int lastColor=colors[0];
        for(int i=0;i<colors.length+k-1;i++){
            int idx=i%n; // wrap around the array
            if(colors[idx]==lastColor){
                // same hai reset kardo
                alternateElementCount=1;
                lastColor=colors[idx];
                continue;
            }
            // extend alternating sequence
            alternateElementCount+=1;
            // if sequence reaches the till k count it
            if(alternateElementCount>=k){
                result++;
            }
            lastColor=colors[idx];
        }
    return result;

    }
}
