class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        //isme cycle detect hora hai use hashset
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            int sum=0;
            while(n!=0){
                int ld=n%10;
                sum+=(ld*ld);
                n=n/10;
            }
            if(sum!=1){
                n=sum;
            }else{
                return true;
            }
        }
        return false;
    }
}
