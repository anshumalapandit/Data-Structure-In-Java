class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                  list.add(1);
                }else{
                    int getValue=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    list.add(getValue);
                }
            }
            ans.add(new ArrayList<>(list)); // imp dont forget to initialsie
        } 
        return ans;
    }
}
