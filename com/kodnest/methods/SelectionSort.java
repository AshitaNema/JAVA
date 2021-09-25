package com.kodnest.learning.methods;

import java.util.Scanner;

//SelectioSort

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = scan.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<=a.length-1; i++){
			System.out.println("Enter an element:");
			a[i] = scan.nextInt();
		}
		System.out.println("Before Sorting:");

		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		Sorting s = new Sorting();
		s.selectioSort(a);
		
		System.out.println("After Sorting:");

		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
