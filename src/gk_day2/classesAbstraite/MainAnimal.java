package gk_day2.classesAbstraite;

public class MainAnimal {

	public static void main(String[] args) {
	
		Animal tab[] = new Animal[4];
		tab[0] = new Oiseau();
		tab[1] = new Poisson();
		tab[2] = new Serpent();
		tab[3] = new Chien();
		
		for(Animal a : tab)
		{
			//a.sedeplacer();
		}

	}

}
