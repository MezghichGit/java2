package gk_day2.apis;

import java.util.*;


public class Exo1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Donner un nom :");
			String nom = sc.nextLine();
			names.add(nom);
		}
		System.out.println(names);
		
		System.out.println("Donner un nom à chercher:");
		String temp = sc.nextLine();
		
		boolean test = names.contains(temp);
		
		if(test == true)
			System.out.println(temp +" Existe dans la liste");
		else
			
			System.out.println(temp +" n'existe pas dans la liste ...");
		

	}

}
