class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
         if (k > arr.length) return new ArrayList<>(); 
        // window larger than array -> return empty (you can change behaviour if you want)
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                //once i acheieve the window i will maintain it
                if(list.size()==0){
                    ans.add(0);
                }else{
                    // now i am confirm that atleast 1 or more than 1 -ne ele i have
                    // but i wanr only one 
                    // first one
                    ans.add(list.get(0));
                    // now slide the window 
                    // but make sure to update the list per window
                    // now the starting pointer of my window is i
                    // if ith element present and it is same then i can remove it 
                    // for maintaining the window i have to remove must first ele
                    if(!list.isEmpty() && arr[i]==list.get(0)){
                        list.remove(0);
                    }
                    // now we can safely slide the window
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
