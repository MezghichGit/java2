package gk_day2.apis;

import java.util.*;

public class Exo2 {

	public static void main(String[] args) {
		
		ArrayList<Membre> membres = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <4; i++)
		{
			System.out.println("Donner un email :");
			String email = sc.nextLine();
			
			System.out.println("Donner l'age :");
			int age = sc.nextInt();
			sc.nextLine(); // pour consommer le caractère retour à la ligne
			
			Membre membre = new Membre(age, email);
			membres.add(membre);
		}
		
		System.out.println(membres);
		
		System.out.println("Veuillez saisir un age :");
		int temp = sc.nextInt();
		
		//foreach : utiliser sur les collections
		for(Membre m : membres)
		{
			if(m.getAge()>=temp)
			{
				System.out.println(m);
			}
			
		}

	}

}
