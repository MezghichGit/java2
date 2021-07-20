package gk_day2.heritage;

public class Oiseau extends Animal{
	public String name = "Canari";
	
	public Oiseau()
	{
		//super("Chien"); //constructeur accepetant un String
		//super(); // appel au constructeur par defaut de la classe mère
		System.out.println("Oiseau");
	}
	
	public void info()
	{
		System.out.println(this.espece + this.pays +this.poids + super.name + this.name);
	}

}
