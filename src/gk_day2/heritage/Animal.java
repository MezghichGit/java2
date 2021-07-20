package gk_day2.heritage;

public class Animal {

	private int age;
	String espece ="Oiseau";
	protected String pays="USA";
	public double poids=200;
	public String name ="Animal";
	
	public Animal()
	{
		System.out.println("Animal");
	}
	
	public Animal(String espece)
	{
		System.out.println("Animal avec paramètre espece");
	}
}
