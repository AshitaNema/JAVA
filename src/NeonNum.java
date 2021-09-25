// Java Program to Check If a Number is Neon number or not

// Importing java input/output library
import java.io.*;
import java.util.Scanner;

class NeonNum {

	// Method to check whether number is neon or not
	// Boolean type
	public static boolean checkNeon(int n)
	{
		// squarring the number to be checked
		int square = n * n;

		// Initializing current sum to 0
		int sum = 0;

		// If product is positive
		while (square > 0) {

			// Step 1: Find remainder
			int r = square % 10;

			// Add remainder to the current sum
			sum += r;

			// Drop last digit of the product
			// and store the number
			square = square / 10;
		}

		// Condition check
		// Sum of digits of number obtained is
		// equal to original number
		if (sum == n)

			// number is neon
			return true;
		else

			// numbe is not neon
			return false;
	}

	// Main driver method
	public static void main(String[] args)
	{
		// Custom input
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int num = (int) Math.sqrt(n);
		// Calling above function to check custom number or
		// if user entered number via Scanner class
		if (checkNeon(num))

			// Print number considered is neon
			System.out.println("True");
		else

			// Print number considered is not neon
			System.out.println("False");
	}
}
