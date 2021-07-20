package gk_day2.heritage;

public class MainVehicule {

	
public static void main(String[] args) {
		
	    Vehicule v = new Voiture();
		Vehicule m = new Moto();
		v.deplacement();  // sur 4 roues
		m.deplacement();  // sur 2 roues
	
	    //Vehicule t = new Vehicule(); // Faux : on ne peut pas créer(instancier) des objets d'une classe abstraite

	}
}
