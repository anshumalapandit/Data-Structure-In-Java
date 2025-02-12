class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        int sum=0;
        while(i<arr.length){
            sum+=arr[i];
            // yaad rakhna ye remove karne k process ek se jyada baar hota use while loop
            while(sum>target){
                sum-=arr[j]; // from starting se remove karte jao
                j++;
            }
            // 2 possibiliy hai ya to sum< hoga ya ==
            if(sum==target){
                ans.add(j+1);
                ans.add(i+1);
                return ans;
            }
            i++;
        }
        ans.add(-1);
        return ans;
    }
}
