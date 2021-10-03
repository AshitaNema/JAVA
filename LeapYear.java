/* leap year */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%4==0) {
		    if(n%100==0) {
		        if(n%400==0) {
		            System.out.println("Leap");
		        }
		        else {
		            System.out.println("No Leap");
		        }
		    }
		    else {
		        System.out.println("Leap");
		    }
		}
		else {
		    System.out.println("No Leap");
		}
		
		
		
	}
}
