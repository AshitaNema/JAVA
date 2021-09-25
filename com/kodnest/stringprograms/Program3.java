package com.kodnest.learning.stringprograms;

import java.util.Scanner;

//Programming in Strings
//WAP to convert a string into character array


public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		char cha[] = str.toCharArray();
		for (int i=0; i<=cha.length-1; i++){
			System.out.print(cha[i] + " ");
		}

	}

}
