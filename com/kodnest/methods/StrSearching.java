package com.kodnest.learning.methods;

public class StrSearching {
	
	boolean checkS(String str){
		char ch[] = str.toCharArray();
		for(int i=0; i<=ch.length-1; i++){
			if(ch[i] == 'S' || ch[i] == 's'){
				return true;
			}
		}
		return false;
	}

}
