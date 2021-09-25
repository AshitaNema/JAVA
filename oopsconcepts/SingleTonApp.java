package oopsconcepts;

public class SingleTonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime pm1 = Prime.Factory();
		System.out.println(pm1);
		Prime pm2 = Prime.Factory();
		System.out.println(pm2);
	}

}
