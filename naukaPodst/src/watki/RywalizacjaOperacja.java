package watki;

public class RywalizacjaOperacja implements Runnable{

	private Licznik licznik;
	private boolean kierunek;
	
	
	public RywalizacjaOperacja(Licznik licznik,boolean kierunek) {
		super();
		this.licznik = licznik;
		this.kierunek=kierunek;
	}



	@Override
	public void run() {
		
		while(true)
		{
			if(kierunek)
				licznik.zwieksz();
			else
				licznik.zmniejsz();
			
			if(licznik.getStan()<0||licznik.getStan()>100)
			{
				break;
			}
		}
		
	}

	
}
