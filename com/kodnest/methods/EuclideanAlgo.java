package com.kodnest.learning.methods;

public class EuclideanAlgo {
	
	int findGCD(int m, int n){
		int rem;
		
		while(n!=0){
			rem = m%n;
			m = n;
			n = rem;
		}
		int gcd = m;
		return gcd;
	}

}
