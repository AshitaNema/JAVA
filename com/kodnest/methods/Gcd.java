package com.kodnest.learning.methods;

import java.util.Scanner;

//WAP to calculate gcd using Euclidean Algorithm. By writing a method returnTypeGCD findGcd(param1, param2)
//aslongas(n!=0){
//	rem = m%n;
//	m=n;
//	n=rem;
//}
//return gcd=m
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 num:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		EuclideanAlgo ea = new EuclideanAlgo();
		int res = ea.findGCD(a,b);
		System.out.println("GCD:"+res);
	}

}
