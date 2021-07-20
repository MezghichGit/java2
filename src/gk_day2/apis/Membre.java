package gk_day2.apis;


// C'est une Classe JavaBeans : Classe POJO : Respectent l'ENCAPSULATION
public class Membre {
	private int age;
	private String email;
	public Membre(int age, String email) {
		super();
		this.age = age;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Membre [age=" + age + ", email=" + email + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
