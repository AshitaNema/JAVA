/* Abundant No. */
/* For example,6 and 28 are Friendly Pair.

(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28. */

import java.util.*;
class Main
{

    public static void main (String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int i, sum1 = 0, sum2=0;
        for(i=1; i<num1; i++)
        {
        if(num1%i == 0)
        {
        sum1 += i;
        }
        }
        for(i=1; i<num2; i++)
        {
        if(num2%i == 0)
        {
        sum2 += i;
        }
        }
        
        if((sum1 == num1) && (sum2 == num2))
        {
        System.out.print("Abundant Number");
        }
        else
        {
        System.out.print("not a Abundant Number");
        }
        

    }
}
