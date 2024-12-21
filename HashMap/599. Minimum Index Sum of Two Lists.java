class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i); // string + its index
        }
        HashMap<String,Integer> common=new HashMap<>();
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int i=map.get(list2[j]);
                int curSum=i+j;
                common.put(list2[j],curSum);
            }
        }
        // take out the min curSum wala from hashmap stored in ans
        int minVal=Integer.MAX_VALUE;
        for(String key:common.keySet()){
            int val=common.get(key);
            if(val<minVal){
                // i found new minimum
                minVal=val;
                ans.clear(); // clear previous result
                ans.add(key); // add current min
            }else if(val==minVal){
                ans.add(key);
            }
        }
        // // take ans in string
        // String s[]=new String[ans.size()];
        // for(int i=0;i<s.length;i++){
        //     s[i]=ans.get(i);
        // }
        // or can direct convert arrayList to string
        return ans.toArray(new String[0]);
    }
}
// without common hashmp as its not required 
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        // 0(n)
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i); // string + its index
        }
    
        // take out the min curSum wala from hashmap stored in ans
        int minVal=Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int val=j+map.get(list2[j]);
            if(val<minVal){
                // i found new minimum
                minVal=val;
                ans.clear(); // clear previous result
                ans.add(list2[j]); // add current min
            }else if(val==minVal){
                ans.add(list2[j]);
            }
        }
        }
        // // take ans in string
        // String s[]=new String[ans.size()];
        // for(int i=0;i<s.length;i++){
        //     s[i]=ans.get(i);
        // }
        // or can direct convert arrayList to string
        return ans.toArray(new String[0]);
    }
}
