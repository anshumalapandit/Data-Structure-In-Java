class Solution {
    public int isPresentinNum1(int target,int num1[]){
       for(int i=0;i<num1.length;i++){
        if(num1[i]==target){
            return i;
        }
       }
       return -1;
    }
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int ans[]=new int[num1.length];
        int last=num2[num2.length-1];
        int id=isPresentinNum1(last,num1);
        if(id!=-1)
        ans[id]=-1;
        Stack<Integer> s=new Stack<>();
        s.push(last);
        int n=num2.length-2;
        for(int i=n;i>=0;i--){
            int idx=isPresentinNum1(num2[i],num1);
            if(idx!=-1){
            while(s.size()>0 && s.peek()<num2[i]){
                s.pop();
            }
            if(s.size()==0){
                ans[idx]=-1;
            }else{
                ans[idx]=s.peek();
            }
            s.push(num2[i]);
        }else{
            s.push(num2[i]);
        }
        }
        return ans;
    }
}
