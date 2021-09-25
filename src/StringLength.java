import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int length=0;
		for(char c1: str.toCharArray()) {
			length++;
		}
		System.out.println(length);
	}

}
