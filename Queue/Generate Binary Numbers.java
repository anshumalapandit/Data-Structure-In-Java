class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=1;i<=n;i++){
            String cur=q.poll();
            ans.add(cur);
            q.add(cur+"0");
            q.add(cur+"1");
        }
        return ans;
    }
}
