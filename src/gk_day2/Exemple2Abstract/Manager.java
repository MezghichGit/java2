package gk_day2.Exemple2Abstract;

public class Manager extends Employer {
	
	@Override
	public void salaire()
	{
	 double valeur = 1500 + nbExp *0.5 *100;
	 System.out.println("Salaire :" +valeur);
	}

}
