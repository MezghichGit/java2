package gk_day2.lesInterfaces;

public class HP implements Imprimante{

	@Override
	public void imprimer() {
		System.out.println("Impression Lazer");
		
	}

	@Override
	public void scanner() {
		System.out.println("Je Scan Photo et Tissu");
		
	}

	@Override
	public void photocopier() {
		System.out.println("Je Photocopie A3 et A4");
		
	}

}
