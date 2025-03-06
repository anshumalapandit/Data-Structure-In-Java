class Solution {
    public int count(ArrayList<Integer> arr,int val){
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==val){
                count++;
            }
        }
        return count;
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int a=-1;
        int b=-1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                arr.add(grid[i][j]);
            }
        }

        for(int i=1;i<=arr.size();i++){
            if(arr.contains(i) && count(arr,i)==2){
                // number is repeated
                a=i;
            }else if(!arr.contains(i)){
                // missing
                b=i;
            }
            if(a!=-1 && b!=-1){
                break;
            }
        }
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}
