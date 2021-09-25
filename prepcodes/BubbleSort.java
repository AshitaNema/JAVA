package prepcodes;

public class BubbleSort {
	
	static int[] bubble(int arr[]){
		int n = arr.length;int temp;
		for (int i=0; i<=n-2; i++) {
			for (int j=0; j<=n-i-2; j++) {
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {14,33,27,10,35,19,42,44};
		bubble(arr);
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
	}

}
