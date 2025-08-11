class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("0");

        while (!q.isEmpty()) {
            String curr = q.poll();

            if (curr.length() == n) {
                ans.add(curr); // jab same length k number aane lage to add karna start kardo 
                // no need to add all
            } else {
                // Always can add '1'
                q.add(curr + "1");

                // Add '0' only if last char is not '0'
                if (curr.charAt(curr.length() - 1) != '0') {
                    q.add(curr + "0");
                }
            }
        }
        return ans;
    }
}
