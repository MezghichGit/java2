package gk_day2.B;

import gk_day2.A.Fournisseur;

public class Consommateur {
	
	public void manger(Fournisseur f)
	{
		f.fournirBoisson();
		f.fournirRepas();
		
	}

}
