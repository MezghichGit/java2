package gk_day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bonjour GK");
		System.out.println("Donner votre nom?");
		
		Scanner sc = new Scanner(System.in);
		
		String nom = sc.nextLine();
		
		System.out.println("Quel est votre age?");
		
		int age = sc.nextInt();
		
		//pour consommser le caract�re d'�chappement apr�s l'appui sur le bouton Entr�
		sc.nextLine();
		
		System.out.println("Quel votre lang. prog. pr�f�r�?");
		
		String lan = sc.nextLine();
		
		System.out.println("Vous �tes : "+ nom + " Vous avez : "+ age +" ans, Lang. pr�f�r� : "+lan);

	}

}
