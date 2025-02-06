class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while(s.size()>0 && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            a.add(ans[i]);
        }
        return a;
    }
}
