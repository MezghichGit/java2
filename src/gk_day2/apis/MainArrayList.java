package gk_day2.apis;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList();
		
		System.out.println(l);
		// taille de la liste : size()
		System.out.println(l.size());
		
		//isEmpty() : savoir si la liste est vide ou pas?
		System.out.println(l.isEmpty());
		
		l.add("Java");
		l.add("Amine");
		l.add("true");
		l.add("20");
		
		System.out.println(l);
		System.out.println(l.size());
		
		l.remove(1);
		System.out.println(l);
		l.clear();
		System.out.println(l);


	}

}
