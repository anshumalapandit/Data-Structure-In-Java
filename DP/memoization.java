package DP;

public class fib {
public static int fibo(int n,int arr[]) {
	// memoization
	if(n==0 || n==1) {
		return n;
	}
	if(arr[n]!=0) { // calculate hua hai ki nhi check
		// if not = to means fib(n) calculate ho chuka hai
		// if calculate ho hi gya hai to return kardo taki dobara call na jaye uss no. k liye
		return arr[n];
	}
	// if calculate nhi hua then call it
	arr[n]= fibo(n-1,arr)+fibo(n-2,arr); // stored it taki uske upper wale levels bhi use kar paye
	return arr[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   int arr[]=new int[n+1];
   System.out.println(fibo(n,arr));
	}

}
