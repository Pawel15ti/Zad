package watki.zadanie1;

public class Parking {

	private int iloscMiejscWolnych;//pamiec
	private int iloscMiejscZajetych;//pamiec

	public Parking(int liczbaMiejscNaParkingu) {
		this.iloscMiejscWolnych = liczbaMiejscNaParkingu;
		this.iloscMiejscZajetych = 0;
	}
	//jesli funckja synchronized - to tylko jeden watek bedzie mogl wykonac ta funkcje(przed wykoanniem zalozy blokade na obiekt a jak skonczy wykonywac to zwolni)
	//jesli inny watek zobaczy ze jest blokada to bedzie musial czekac
	public synchronized boolean symulacjaWjazdu(int waga) {
		if (iloscMiejscWolnych >= waga) {
			iloscMiejscWolnych -= waga;
			iloscMiejscZajetych += waga;
			return true;
		} else {
			return false;
		}
	}

	public synchronized void symulacjaWyjazdu(int waga){
		
		iloscMiejscWolnych+=waga;
		iloscMiejscZajetych-=waga;
		
		
	}

	public int getIloscMiejscWolnych() {
		return iloscMiejscWolnych;
	}

	public int getIloscMiejscZajetych() {
		return iloscMiejscZajetych;
	}
	
	
}
