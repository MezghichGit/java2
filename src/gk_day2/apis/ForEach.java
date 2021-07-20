package gk_day2.apis;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {


		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(12);
		l.add(2);
		l.add(122);
		l.add(8);
		System.out.println(l);
		// premi�re m�thode pour afficher le contenu de la liste : Loop classique
		for(int i = 0;i<l.size();i++)
		{
			System.out.println(l.get(i));  //get(int index) : cette methode permet de r�cup�er l'element d'indice index
		}
		
		// deuxi�me m�thode pour afficher le contenu de la liste : Enhanced(avanc�e) Loop
		
		for(Integer e : l)
		{
			System.out.println(e);  // foreach
		}

	}

}
