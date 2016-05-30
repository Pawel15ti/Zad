package watki;

public class OperacjaWykonywanaWRamachWatku implements Runnable{

	private int licznik;
	
	public OperacjaWykonywanaWRamachWatku() {
		this.licznik=1;
	}
	
	@Override
	public void run() {
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Licznik wartosc="+licznik+"   - watek "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			//usupiamy watek - symuluje 1000 milisekund przerwy
			licznik++;
			
		}
		
	}

}
