package Podstawy;

public class TestMapy {

	public static void main(String[] args) {
		
		Mapy mapa = new Mapy();
		mapa.dodaj(1, "Lara");
		mapa.dodaj(1, "Rick");
		mapa.dodaj(0, "Rick0");
		mapa.dodaj(2, "Rick2");
		mapa.dodaj(3, "Rick3");
		System.out.println();
		mapa.wyswietl(0);
		System.out.println();
		mapa.usuwanie(0);
		System.out.println();
		mapa.wyswietl(0);
		System.out.println();
		mapa.wyswietl(1);

	}

}
