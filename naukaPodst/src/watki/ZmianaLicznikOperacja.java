package watki;

public class ZmianaLicznikOperacja implements Runnable {

	private Licznik licznik;
	private boolean kierunek;
	
	
	
	public ZmianaLicznikOperacja(Licznik licznik, boolean kierunek) {
		super();
		this.licznik = licznik;
		this.kierunek = kierunek;
	}



	@Override
	public void run() {
		
		
		for(int i=0;i<1000;i++)
		{
			System.out.println();
			
			if(kierunek)
			{
				
				licznik.zwieksz();
			}
			else
			{
				
				licznik.zmniejsz();
			}
			
			System.out.println();
			
			
		}
	}

}
