package gk_day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bonjour GK");
		System.out.println("Donner votre nom");
		
		Scanner sc = new Scanner(System.in);
		
		String nom = sc.nextLine();
		
		System.out.println("Quel est votre age");
		
		int age = sc.nextInt();
		
		System.out.println("Vous êtes : "+ nom + " Vous avez : "+ age +" ans");

	}

}
