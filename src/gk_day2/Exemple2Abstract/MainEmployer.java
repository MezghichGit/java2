package gk_day2.Exemple2Abstract;

public class MainEmployer {

	public static void main(String[] args) {
	
		Employer tab[] = new Employer[3];  // tab : c'est tableau polymorphe
		tab[0] = new Directeur();
		tab[1] = new Manager();
		tab[2] = new Developpeur();
		for(Employer e : tab)
		{
			e.salaire();
		}

	}

}
