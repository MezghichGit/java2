package gk_day2.Exemple2Abstract;

public class Directeur extends Employer{
	
	
	public void salaire()
	{
	 double valeur = 2500 + nbExp *0.6 *100 + 300;
	 System.out.println("Salaire :" +valeur);
	}

}
