package watki;

public class ZmianaLicznikOPeracjaZBlokowaniem implements Runnable {

	private Licznik licznik;
	private boolean kierunek;

	public ZmianaLicznikOPeracjaZBlokowaniem(Licznik licznik, boolean kierunek) {
		super();
		this.licznik = licznik;
		this.kierunek = kierunek;
	}

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			synchronized (licznik) { //proba zalozenia blokady przez watek na obiekt licznika

				System.out.println();

				if (kierunek) {

					licznik.zwieksz();
				} else {

					licznik.zmniejsz();
				}

				System.out.println();
			}

		}
	}
}
