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
