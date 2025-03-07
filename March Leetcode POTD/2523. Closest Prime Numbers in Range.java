class Solution {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int []ans=new int[2];
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
              temp.add(i);
            }
        }
       
        int a=-1;
        int b=-1;
         if(temp.size()==0){
            ans[0]=a;
            ans[1]=b;
            return ans;
        }
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<temp.size()-1;i++){
          int curDiff=Math.abs(temp.get(i)-temp.get(i+1));
          if(curDiff<minDiff){
             minDiff=curDiff;
             a=temp.get(i);
             b=temp.get(i+1);
          }else if(curDiff==minDiff){
            if(a>temp.get(i)){
             // changes
             a=temp.get(i);
             b=temp.get(i+1);
            }else{
                continue;
            }
          }
        }
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}
