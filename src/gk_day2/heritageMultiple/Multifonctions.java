package gk_day2.heritageMultiple;

public class Multifonctions implements Imprimante,Scanner,Photocopie{

	@Override
	public void photocopier() {
		System.out.println("Photocopie couleur");
		
	}

	@Override
	public void scanner() {
		System.out.println("scann papier");
		
	}

	@Override
	public void imprimer() {
		System.out.println("impression rapide en Lazer");
		
	}

}
