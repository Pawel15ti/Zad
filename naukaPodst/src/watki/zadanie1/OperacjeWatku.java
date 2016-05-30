package watki.zadanie1;

public class OperacjeWatku implements Runnable{
	
	private int wagaPojazdu;
	private Parking parking;
	private static final int OPOZNIENIE=1;
	
	public OperacjeWatku(int wagaPojazdu,Parking parking) {
		this.wagaPojazdu=wagaPojazdu;
		this.parking=parking;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=50;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+" Proba wjazdu do parkingu");
				boolean result=parking.symulacjaWjazdu(wagaPojazdu);
				if(result==true)
				{
					System.out.println(Thread.currentThread().getName()+" Samochod wjechal na parking , liczba miejsc wolnych: "+parking.getIloscMiejscWolnych());
					Thread.sleep(OPOZNIENIE);
					parking.symulacjaWyjazdu(wagaPojazdu);
					System.out.println(Thread.currentThread().getName()+" Samochod wyjechal z parkingu , liczba miejsc wolnych: "+parking.getIloscMiejscWolnych());
				}
				else
					System.out.println(Thread.currentThread().getName()+" nie udalo sie wjechac, liczba miejsc wolnych: "+parking.getIloscMiejscWolnych());
				
				Thread.sleep(OPOZNIENIE);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
		
	}
	

}
