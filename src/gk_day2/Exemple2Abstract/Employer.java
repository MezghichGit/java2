package gk_day2.Exemple2Abstract;

public abstract class Employer {

	String nom;
	String email;
	int age;
	int nbExp;
	
	public void info()
	{
		System.out.println(nom +" "+email+" "+age);
	}
	
	public abstract void salaire();
	
	
}
