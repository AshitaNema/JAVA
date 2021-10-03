//A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,fact,rem;
		int sum = 0;
		int temp = n;
		while(n!=0) {
		    i=1;
		    fact = 1;
		    rem = n % 10;
		    
		    while(i<=rem) {
		        fact = fact * i;
		        i++;
		    }
		    sum = sum + fact;
		    n = n/10;
		}
		if(sum == temp) {
		    System.out.println("Yes");
		}
		else {
		    System.out.println("No");
		}
	}
}
