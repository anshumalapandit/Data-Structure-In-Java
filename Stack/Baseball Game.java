class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String cur=operations[i];
            if(cur.equals("C")){
               s.pop();
            }else if(cur.equals("D")){
                // take out the cur node from stack doublt it then push
                int popp=s.peek();
                popp=popp*2;
                s.push(popp);
            }else if(cur.equals("+")){
               int cur1=s.pop();
               int cur2=s.pop();
               int sum=cur1+cur2;
               s.push(cur2);
               s.push(cur1);
               s.push(sum);
            }else{
                int value=Integer.parseInt(cur);
                if(value<0 || value>=0 || value<=9)
                s.push(value);
            }
        }
        int ans=0;
        while(s.size()>0){
          ans+=s.pop();
        }
        return ans;
    }
}
