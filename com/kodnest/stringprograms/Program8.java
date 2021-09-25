package com.kodnest.learning.stringprograms;

import java.util.Scanner;

//in: how are you
//op: how$are$you

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter");
		String sent = scan.nextLine();
		char arr[] = sent.toCharArray();
		for (int i=0; i<=arr.length-1; i++){
			if(arr[i] == ' '){
				arr[i] = '$';
			}
		}
		sent = new String(arr);
		System.out.println(sent);
		
	}

}
