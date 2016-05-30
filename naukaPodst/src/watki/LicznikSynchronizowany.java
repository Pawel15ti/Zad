package watki;

public class LicznikSynchronizowany extends Licznik {

	public LicznikSynchronizowany(int stan) {
		super(stan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public synchronized  void zwieksz() {
		
		super.zwieksz();
	}

	@Override
	public synchronized void zmniejsz() {
		
		super.zmniejsz();
	}
	//uzywamy synchronized na metodach ktore zmienia wartosc pol klasy
	
	//stan=0
	    //watek dodajacy zaklada blokade na obiekcie klasy LicznikSynchrozniowany
	    //zanim wywola metoe zwieksza() zostaje sprawdza blokada (brak blokady watek zaklada blokade na obiekt)
		//watek dodajacy wykonuje 1 tmp=0
		//watek dodajacy wynuje   2 tmp=0
		//watek dodajacy wywlaszczony - zatrzymany przez system
		//watek odejumjacy wznowiony 
	    //sprawdzanie blokady przed wywolaniem funkcji zmiejsz()- blokada jest zalozona przez watek dodajacy
	    //watek odejmujacy czeka na zwolnienie blokady
	    //watek dodajacy zostaje wznowiony
			//dodatek dodajacy wykonuje operacje 3 tmp=1
			//dodatek dodajacy wykonuje operacje 4 tmp=1
			//dodatek dodajacy wykonuje operacje 5 tmp=1
			//stan=1
	    //watek dodajacy konczy wykonanie operacji zwieksz() i zwalnia blokade
	    //watek dodajacy wywlaszczony
	    //watek odejmujacy zostaje wznowiony
	    // watek odejmujacy zaklada blokada na obiekt
		// watek odejmujacy wykonuje operacje 1 tmp=0
		// watek odejmujacy wykonuje operacje 2 tmp=0
		// watek odejmujacy wykonuje operacje 3 tmp=-1
		// watek odejmujacy wykonuje operacje 1 tmp=-1
		// watek odejmujacy wykonuje operacje 1 tmp=-1
		//stan=-1
		//watek odejmujacy zostaje wywlaszczony czyli zatrzymanay 
		

}
