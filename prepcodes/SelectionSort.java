package prepcodes;


public class SelectionSort {
	
	static int[] selectionSort(int arr[]){
		int n=arr.length;
		int temp;
		for(int i=0; i<=n-2; i++){
			
			for(int j=i+1; j<=n-1; j++){
				if(arr[j]<arr[i]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {14,32,56,43,76,34,27};
		selectionSort(arr);
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
	}
	

}
