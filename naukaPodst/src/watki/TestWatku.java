package watki;

public class TestWatku {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		//1 Tworzenie obiektu ktory zawiera metode run z interfejsu Runnable() ktora zostanie wykonana w ramach watku
		OperacjaWykonywanaWRamachWatku operacja1=new OperacjaWykonywanaWRamachWatku();
		OperacjaWykonywanaWRamachWatku operacja2=new OperacjaWykonywanaWRamachWatku();
		//Utworzoenie nowego watku
		Thread watek1=new Thread(operacja1);
		Thread watek2=new Thread(operacja2);
		//Wystartowanie watku
		watek1.start();
		watek2.start();
		System.out.println("Koniec funkcji main");
		
		//i7 4 rdzenie i 2 watki na rdzen => w jednym czasie obslugiwane sa tylko 8 watkow
	}

}
