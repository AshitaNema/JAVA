package prepcodes;

public class RotateArray {
	static int[] rotate(int arr[], int n) {
	    
		int last = arr[n-1];
		for(int j=(n-1); j>0; j--) {
			arr[j] = arr[j-1];
		}
		arr[0]= last;
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4};
        int t = 2;
        int n = arr.length;
        
        while(t>0) {
        	arr = rotate(arr,n);
        	t--;
        }
        for(int i=0; i<n; i++) {
        	System.out.println(arr[i]);
        }

	}

}
