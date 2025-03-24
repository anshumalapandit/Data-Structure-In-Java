// jab bhi interval k question ho try to sort the array of intervals acc to starting or ending
class Solution {
    public void removeThoseDays(ArrayList<Integer> al,int start,int end){
        for(int i=start;i<=end;i++){
            if(al.contains(i)){
                al.remove(Integer.valueOf(i));
            }
        }
    }
    public int countDays(int days, int[][] meetings) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<days;i++){
            al.add(i+1);
        }
        for(int meet[]:meetings){
            int start=meet[0];
            int end=meet[1];
            removeThoseDays(al,start,end);
            if(al.size()==0){
                break;
            }
        }
        if(al.size()==0){
            return 0;
        }
        return al.size();
    }
}
// optimised :
3169. Count Days Without Meetings
    class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        int result = 0;
        int end = 0;
        
        for (int[] meet : meetings) {
            if (meet[0] > end) {
                result += meet[0] - end - 1;
            }
            end = Math.max(end, meet[1]);
        }
        
        if (days > end) {
            result += days - end;
        }
        
        return result;
    }
}
