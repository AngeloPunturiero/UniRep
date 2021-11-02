package Pack1;

public class Utente 
{
	protected String CF;
	protected String CodiceAut;
	
	public Utente()
	{
		
	}
	
	public Utente LogIn(String cf, String ca)
	{
		int a = 0;
		//se l'utente è elettore a = 1
		//se l'utente e scrutinatore a = 0 
		
		if(a==0)
		{
			//return this.Elettore(CF, CodiceAut);
		}
		else if(a==1)
		{
			//return this.Scrutinatore(CF, CodiceAut);
		}
		else
		{
			System.out.println("Utente non valido");
		}
		
		return this; //inserito solo per non far dare errore al metodo, VA CANCELLATO ED IMPLEMENTATO SUCCESSIVAMENTE
	}
	
	public Elettore IsElettore() {
        Elettore e = new Elettore(CF, CodiceAut);
        return e;
    }
	
	public Scrutinatore IsScrutinatore() {
		Scrutinatore s = new Scrutinatore(CF, CodiceAut);
        return s;
    }	
}