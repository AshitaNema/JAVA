package com.kodnest.learning.stringprograms;

import java.util.Scanner;

//WAP to reverse each word in a sentence
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:");
		String sent = scan.nextLine();
		String strarr[] = sent.split(" ");
		String revsent = "";
		
		for(int i=0; i<=strarr.length-1; i++){
			String word = strarr[i];
			String revword = "";
			for (int j=word.length()-1; j>=0; j--){
				revword = revword + word.charAt(j);
			}
			revsent = revsent + revword + " ";
		}
		System.out.println(revsent);

	}

}
