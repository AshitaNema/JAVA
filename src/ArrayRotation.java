
public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int k = 3;
		rightRotate(arr,k);
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		leftRotate(arr2,k);
		for(int i=0; i<=arr2.length-1; i++){
			System.out.println(arr2[i]+" ");
		}
		
	}

	private static void leftRotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		if(k<=0 || k>n-1) {
			return;
		}
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		
	}

	private static void rightRotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		if(k<=0 || k>=n){
			return;
		}
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-k-1);
		reverse(arr,0,n-1);
		
	}

	private static void reverse(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		for (int i = low, j = high; i < j; i++, j--) {
			int data = arr[i];
			arr[i] = arr[j];
			arr[j] = data;
        }
	}

}
