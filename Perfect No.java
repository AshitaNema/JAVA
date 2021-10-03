/* Perfect No. */

import java.util.*;
class Main
{

    public static void main (String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        int i, sum = 0;
        for(i=1; i<num; i++)
        {
        if(num%i == 0)
        {
        sum += i;
        }
        }
        
        if(sum == num)
        {
        System.out.print("Perfect Number");
        }
        else
        {
        System.out.print("not a Perfect Number");
        }
        

    }
}
