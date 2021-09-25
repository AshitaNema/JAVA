package oopsconcepts;

public class Prime {
	static Prime pm = null;
	
	private Prime(){
		
	}
	
	public static Prime Factory(){
		if(pm == null){
			pm = new Prime();
			return pm;
		}
		else{
			return pm;
		}
	}

}
