package gk_day2.LesException;

public class Main {

	public static void main(String[] args) {
		int x=10;
		int y = 0;
		int tab[] = {10,5,4};
		String ch =null;
		try {
		System.out.println(x/y);
			//System.out.println(tab[3]);
			//System.out.println(ch.length());
		}
		
		catch(NullPointerException e)
		{

			System.out.println("Un pointeur null");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Indice de tableau invalide");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Un probleme est survenue, je sais pas");
			return;
		}
		//if(x == 10) {return;}
		
		finally {
		System.out.println("Suite du programme...");
		}

	}

}
