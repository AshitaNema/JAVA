import java.util.*;
public class abc {
	public static int getProduct(int n)
    {
        int product = 1;
 
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
 
        return product;
    }
	public static int countDistinct(int arr[],int n)
    {
 
        HashSet<Integer> hs = new HashSet<Integer>();
 
        for(int i = 0; i < n; i++)
        {
            
            hs.add(arr[i]);
        }
         
        
        return hs.size();    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n; i++) {
			int ele = scan.nextInt();
			arr[i] = getProduct(ele);
		}
		System.out.println(countDistinct(arr,
                arr.length));
		
	}

}
