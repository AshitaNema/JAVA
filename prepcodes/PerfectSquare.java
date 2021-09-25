package prepcodes;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
//		for(int i=0;i<=num/2;i++){
//			if(i*i==num){
//				System.out.println("YES "+i);
//				System.exit(0);
//			}
//		}
//		System.out.println("NO");
		double i = Math.sqrt(num);
		if(i*i==num){
			System.out.println("YES "+i);
		}
		else{
			System.out.println("NO");
		}
	}

}
