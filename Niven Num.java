/* Niven No. */
/* Number is an integer that is divisible by the sum of its digits. */

import java.util.*;
public class Main
{
	
    public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int temp = num;int sum=0;
		while(temp !=0 ) {
		    sum = sum +  (temp%10);
		    temp/=10;
		}
		if(num%sum == 0) {
		    System.out.println("Niven Num");
		}
		else {
		    System.out.println("False");
		}
		
	}
}
