package oopsconcepts;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] arr = new int[m];
        for (int i=0;i<=arr.length-1;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(birthdayCakeCandles(arr));
    }

	public static int birthdayCakeCandles(int []arr) {
    // Write your code here
    int max=0;
    int count=0;
    max = arr[0];
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    for(int i=0;i<=arr.length-1;i++){
        if(max == arr[i]){
            count++;
        }
    }
    return count;
    }

}
