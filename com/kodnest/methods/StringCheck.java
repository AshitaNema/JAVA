package com.kodnest.learning.methods;

import java.util.Scanner;

//WAP to check whether the string contains the character 'S' or not without using the inbuilt functions(contains(),charAt()or indexof())
//Write the logic in method checkS(string) which will return boolean type value.

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = scan.nextLine();
		StrSearching ss = new StrSearching();
		boolean res = ss.checkS(str);
		System.out.println("Result: "+res);
	}

}
