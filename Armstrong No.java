/* Armstrong No. */

import java.util.*;
class Main
{

    public static void main (String[] args)
    {
        int n, rem=0, res=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp=n;
        int cnt=0;
        while(temp!=0) {
            temp/=10;
            cnt++;
        }
        
        temp = n;
        
        while(temp!=0) {
            rem = temp%10;
            res += Math.pow(rem,cnt);
            temp/=10;
        }
        if(res == n) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

    }
}
