/* Prime No. */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==2) {
		    System.out.println("P");
		}
		else if(n%2 == 0) {
		    System.out.println("N");
		}
		else {
		    int i;
		    for(i=3; i<=Math.sqrt(n); i++) {
		        if(n%i == 0) {
		            
		            break;
		        }
		    }
		    
		    if(i>Math.sqrt(n)) {
		        System.out.println("P");
		    }
		    else {
		        System.out.println("N");
		    }
		}
		
		
		
	}
}
