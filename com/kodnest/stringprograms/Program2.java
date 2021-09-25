package com.kodnest.learning.stringprograms;

//Programming in Strings
//WAP to replace 'hello' with 'hai' in a given string

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hello omkar hello";
		s = s.replaceAll("hello", "hai");
		System.out.println(s);

	}

}
