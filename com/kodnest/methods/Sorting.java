package com.kodnest.learning.methods;

public class Sorting {
	
	void selectioSort(int a[]){
		int min;
		int pos;
		int help;
		for(int i=0; i<=a.length-2; i++){
			min = a[i];
			pos = i;
			for(int j=i+1; j<=a.length-1; j++){
				if(a[j]<min){
					min = a[j];
					pos = j;
				}
			}
			help = a[i];
			a[i] = a[pos];
			a[pos] = help;
			
		}
	}
	
	void insertionSort(int a[]){
		int item;
		int j;
		for(int i=1; i<=a.length-1; i++){
			item = a[i];
			j = i-1;
			
			while(j>=0 && a[j]>item){
				a[j+1] = a[j]; //push one level down
				j--;
			}
			a[j+1] = item;
		}
	}

}
