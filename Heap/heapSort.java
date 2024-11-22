package sem3;

public class Heapsort {
//T.C=> 0(nlongn)
//logic =fixed
	// 2 steps 
	// if mujhe ascending order mai sort karna hai to max heap banana padta hai
	//steps 1: build max heap
	public static void hs(int arr[]) {
		int n=arr.length;
		for(int i=n/2;i>=0;i--) {
			heapify(arr,i,n);
		}
		//steps 2: 
		// 2. push largest elem at end(swap first and lar) +heapify(0);
		for(int i=n-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,0,i);
		}
	}
	public static void heapify(int arr[],int i,int size) {
		int left=2*i+1;
		int right=2*i+2;
		int maxIdx=i;
		if(left<size && arr[left]>arr[maxIdx]) {
			maxIdx=left;
		}
		if(right<size && arr[right]>arr[maxIdx]) {
			maxIdx=right;
		}
		if(maxIdx!=i) {
			//swap first and last
			int temp=arr[i];
			arr[i]=arr[maxIdx];
			arr[maxIdx]=temp;
			heapify(arr,maxIdx,size);
		}
	}
	//if mujhe descendinf order mai sort , min heap se karungi
	//now i will sort in asecnding order 
	// min heap=> meax heap call heapify fxn for non leaf node
	
	// 3. detached last element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,4,5};
		System.out.println("My array before: ");
		for(int i=0;i<arr.length;i++) {
	    	   System.out.print(arr[i]+" ");
	       }
		System.out.println();
		System.out.println("After implementing Heap sort my arrays :");
		hs(arr);
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
	}

}

