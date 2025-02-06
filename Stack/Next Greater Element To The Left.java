Stack<Integer> s=new Stack<>();
    int ans[]=new int[n];
    ans[n-1]=-1;
    s.push(arr[n-1]);
    for(int i=n-2;i>=0;i--){
        while( s.size()>0 && s.peek()<arr[i]){ //lesser hai to remove
            s.pop(); 
        } //now i found greater
        //what if stack becomes empty no nge exist
        if(s.size()==0){
            ans[i]=-1;
        }else{
            ans[i]=s.peek();
        }
        s.push(arr[i]);
    }
    return ans;
