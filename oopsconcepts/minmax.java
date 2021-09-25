package oopsconcepts;

import java.util.Scanner;

public class minmax {
	

	
	    static void insertionSort(int a[]){
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
	    static void minMax(int arr[]){
	        int max =0 ;
	        int min =0;
	        
	        for(int i=0; i<=arr.length-2; i++){
	            min = min + arr[i];
	        }
	        
	        for(int i=1; i<=arr.length-1; i++){
	            max = max + arr[i];
	        }
	        
	        System.out.println(min + " " + max);
	    }
	    
	    public static void main(String []args){
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int arr[] = new int[n];
	        for (int i=0; i<=n-1; i++){
	            arr[i] = scan.nextInt();
	        }
	        insertionSort(arr);
	        
	        minMax(arr);
	    }
	
}
