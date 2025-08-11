class Solution {
    // public static int convertBin(int n){
    //     int ans=0; // no need ki answer form karne k liye int hi lena pare stringBuilder also works
    //     while(n!=0){
    //         int rem=n%2; // jab decimal number form karna rehta hai to %10 karte hai 
    //         // jab binary number form karna rehta %2 karna padta hai
    //         ans=(ans*10)+rem; // ye same rehta hai answer form karne mai help karta hai  bich mai same 
    //         n=n/2; // jab decimal form karte hai to n/10 karte hai but during binary /2 likhte hai
    //     }
    //     return ans;
    // }
    public static String convertBin(int n) {
        StringBuilder bin = new StringBuilder();
        while (n != 0) {
            int rem = n % 2;
            bin.append(rem); // jab hum stringBuilder use karte hai to direct append kardo no need to use formula rem ko append kardo direct
            n = n / 2;
        }
        bin.reverse();
        return bin.toString();
    }
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i]);
            String bin=convertBin(num);
            if(i==arr.length-1){
                sb.append(bin);
            }else
            sb.append(bin+"-");
        }
        return sb.toString();

    }
}
