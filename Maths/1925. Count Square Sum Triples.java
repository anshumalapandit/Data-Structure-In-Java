class Solution {
    public int countTriples(int n) {
        int count=0;
        // Approach 1 : Brute fore 0(n cube)
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         for(int k=1;k<=n;k++){
        //             int a=i*i;
        //             int b=j*j;
        //             int c=k*k;
        //             if(a+b==c){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;
        // better 0(n sq)
        for(int c=1;c<=n;c++){
            for(int a=1;a<=n;a++){
                int x=(c*c)-(a*a);
                // b2=c2-a2
                // now check validity of b
                int b=(int)Math.sqrt(x);
                if((b*b)==x && b<=n && b>=1){
                    count++;
                }
            }
        }
        return count;
    }
}
