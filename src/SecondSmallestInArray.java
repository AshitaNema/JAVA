import java.util.Scanner;
import java.io.*;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int first, second;
		first = second = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second && arr[i] != first) {
				second = arr[i];
			}
		}
		if(second == Integer.MAX_VALUE) {
			System.out.println("No element found");
		}
		else {
			System.out.println("Is is "+ second);
		}
	}

}
