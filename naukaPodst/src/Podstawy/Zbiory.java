package Podstawy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbiory {
	public static void main(String[] args) {
		Set zbior=new HashSet<String>();
		Set zbior2=new TreeSet<String>();
		Lista l = new Lista();
		
		Lista li=new Lista();
		l.kopiujZbior(zbior, zbior2);
			
		
	
		l.wyswietlZbior();
	System.out.println();
		l.dodajImie("Ania");
		l.dodajImie("Anna");
		l.dodajImie("Basia");

		l.wyswietlZbior();

		System.out.println(l.zliczElementy());
		
		System.out.println("usuwanie");
		
		l.usunElement("Ania");
		
		l.wyswietlZbior();

		System.out.println(l.zliczElementy());
	}

}
