package com.kodnest.learning.stringprograms;

import java.util.Scanner;

//Programming in Strings
//WAP to reverse the string without using inbuilt function
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		int j = arr2.length-1;
		for (int i=0; i<=arr1.length-1; i++){
			arr2[j] = arr1[i];
			j--;
		}
		str = new String(arr2);
		System.out.println(str);

	}

}
