package com.kodnest.learning.stringprograms;

import java.util.Scanner;

//inp: how are you
//out: you are how

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:");
		String sent = scan.nextLine();
		String arr[] = sent.split(" ");
		String rev = "";
		
		for(int i=arr.length-1; i>=0; i--){
			rev = rev + arr[i] + " ";
		}
		System.out.println(rev);
		

	}

}
