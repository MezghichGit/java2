package gk_day2.polymorphismeHeritage;

public class Main {

	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		Animal a = new Animal();
		
		//a= o; //OK
		
		Oiseau o2 = new Oiseau();
		a = o2; //UpCast
		//o = (Oiseau)a;  // NOT OK
		
		o = (Oiseau)a;
		
		System.out.println("Suite du programme...");

	}

}
