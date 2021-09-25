package prepcodes;

public class SingleNumber {
	
	public static int singleNumber(int[] arr) {
	     int xor = arr[0];
	     for(int i=1; i<=arr.length-1; i++) {
	          xor = xor ^ arr[i];
	     }
	     return xor;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,1};
		System.out.println(singleNumber(arr));
	}

}
