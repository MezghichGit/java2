package gk_day2.Exemple2Abstract;

public class Developpeur extends Employer {
	
	
	public void salaire()
	{
	 double valeur = 1200 + nbExp *0.3 *100;
	 System.out.println("Salaire :" +valeur);
	}

}
