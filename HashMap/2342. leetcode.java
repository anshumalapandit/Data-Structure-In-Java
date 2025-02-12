class Solution {
    public int SumOfEle(int n){
        int ans=0;
        while(n!=0){
            int ld=n%10;
            ans+=ld;
            n=n/10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               int cur=nums[i];
               int cur2=nums[j];
               int soe=SumOfEle(cur);
               int soe2=SumOfEle(cur2);
               if(soe==soe2){
                 int sum=cur+cur2;
                 max=Math.max(max,sum);
               }
            }
        }
        return max==Integer.MIN_VALUE? -1: max;
    }
}
// optimal soluiton
class Solution {
    public int SumOfEle(int n){
        int ans=0;
        while(n!=0){
            int ld=n%10;
            ans+=ld;
            n=n/10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int soe=SumOfEle(cur);
            if(map.containsKey(soe)){
               int value=map.get(soe);
               if(cur>value){
                // update kardo
                map.put(soe,cur);
               }
               // now calculate max
               int sum=value+cur;
               max=Math.max(max,sum);
            }else{
             map.put(soe,cur);
            }  
        }
        return max;
    }
}
