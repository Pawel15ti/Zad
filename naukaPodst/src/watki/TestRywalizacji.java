package watki;

public class TestRywalizacji {

	public static void main(String[] args) throws InterruptedException
	{
		Licznik licznik=new Licznik(50);//zasob wspoldzielony
		RywalizacjaOperacja operacjaDodawanie=new RywalizacjaOperacja(licznik, true);
		RywalizacjaOperacja operacjaOdejmowanie=new RywalizacjaOperacja(licznik, false);
		
		Thread t1=new Thread(operacjaDodawanie);
		Thread t2=new Thread(operacjaOdejmowanie);
		
		t1.start();
		t2.start();
		
		//czekamy na zakonczenie
		
		t1.join();
		t2.join();
		//ktorys z watkow wygra rywalizacje i licznik bedzie mial wartosc albo -1(wygrywa odejmujacy) lub 101(wygrywa dodajacy)
		System.out.println(licznik.getStan());
		//Problem pamieci wspoldzielonej
		licznik=new Licznik(0);
		
		ZmianaLicznikOperacja operacjaZwiekszania=new ZmianaLicznikOperacja(licznik, true);
		ZmianaLicznikOperacja opacjaZmiejszania=new ZmianaLicznikOperacja(licznik, false);
		
		t1=new Thread(operacjaZwiekszania);
		t2=new Thread(opacjaZmiejszania);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		//wynik jest zawsze losowy
		System.out.println(licznik.getStan());
		
		//synchronizacja
		
		LicznikSynchronizowany licznikS=new LicznikSynchronizowany(0);
		
		operacjaZwiekszania=new ZmianaLicznikOperacja(licznikS, true);
		opacjaZmiejszania=new ZmianaLicznikOperacja(licznikS, false);
		
		t1=new Thread(operacjaZwiekszania);
		t2=new Thread(opacjaZmiejszania);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		//wynik jest zawsze losowy
		System.out.println("Stan niesynchronizowany:"+licznik.getStan());
		System.out.println("Stan synchronizowany:"+licznikS.getStan());
		
		
	}
}
