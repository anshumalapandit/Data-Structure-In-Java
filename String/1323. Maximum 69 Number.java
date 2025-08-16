class Solution {
    public int maximum69Number (int num) {
        char arr[]=Integer.toString(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                // only change first 6 to 9 , changing further 6 will obviouly give me smaller number
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}
