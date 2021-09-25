import java.util.Scanner;

public class ToggleEachCharInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String s1 = "";
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s1=s1+Character.toLowerCase(str.charAt(i));
			}
			else {
				s1 = s1+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(s1);
	}

}
