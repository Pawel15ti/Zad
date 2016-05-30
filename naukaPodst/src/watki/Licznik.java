package watki;

public class Licznik {

	private int stan;

	public Licznik(int stan) {
		super();
		this.stan = stan;
	}
	
	public void zwieksz()
	{
		int tmp=stan;                  //1
 		System.out.println();          //2
		tmp++;                         //3
		System.out.println();          //4
		this.stan=tmp;                 //5
				
	
		
	}
	
	public void zmniejsz()
	{
		
		int tmp=stan;
		System.out.println();
		tmp--;
		System.out.println();
		this.stan=tmp;
		
	}
	//stan=0
	//watek dodajacy wykonuje 1 tmp=0
	//watek dodajacy wynuje   2 tmp=0
	//watek dodajacy wywlaszczony - zatrzymany przez system
	//watek odejumjacy wznowiony 
	// watek odejmujacy wykonuje operacje 1 tmp=0
	// watek odejmujacy wykonuje operacje 2 tmp=0
	// watek odejmujacy wykonuje operacje 3 tmp=-1
	// watek odejmujacy wykonuje operacje 1 tmp=-1
	// watek odejmujacy wykonuje operacje 1 tmp=-1
	//stan=-1
	//watek odejmujacy zostaje wywlaszczony czyli zatrzymanay 
	//watek dodajacy zostaje wznowiony
	//dodatek dodajacy wykonuje operacje 3 tmp=1
	//dodatek dodajacy wykonuje operacje 4 tmp=1
	//dodatek dodajacy wykonuje operacje 5 tmp=1
	//stan=1
	public int getStan()
	{
		return stan;
	}
}
