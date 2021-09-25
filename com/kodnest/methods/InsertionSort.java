package com.kodnest.learning.methods;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0; i<=a.length-1; i++){
			System.out.println("Enter an Element");
			a[i] = scan.nextInt();
		}
		
		System.out.println("Before Sorting");
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		Sorting s = new Sorting();
		s.insertionSort(a);
		
		System.out.println("After Sorting");
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
//arrange in descending order
//methods for bubble,linear search, binary search
