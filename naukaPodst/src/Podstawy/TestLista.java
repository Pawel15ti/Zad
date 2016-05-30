package Podstawy;

public class TestLista {

	public static void main(String[] args) {
		Lista2 lista=new Lista2();
		lista.dodajE(1);
		lista.dodajE(2);
		lista.dodajE(3);
		lista.dodajE(4);
		lista.wyswietlE();
		System.out.println();
		System.out.println(lista.rozmiar());
		System.out.println();
		lista.usunE(2);
		lista.wyswietlE();
		System.out.println();
		System.out.println(lista.rozmiar());
	}

}
