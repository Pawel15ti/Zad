package typenum;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba osoba=new Osoba(Osoba.PLEC_KOBIETA);
		System.out.println(osoba.isKobieta());
		System.out.println(osoba.isMezczyzna());
		
		Osoba2 os2=new Osoba2(Plec.KOBIETA);
		System.out.println(os2.isKobieta());
		System.out.println(os2.isMezczyzna());
		System.out.println("Zwraca nam liczbe porzadkowa");
		System.out.println(Plec.KOBIETA.ordinal());
		System.out.println(Plec.MEZCZYZNA.ordinal());
		System.out.println("Zwca nazwe stalej");
		System.out.println(Plec.KOBIETA.name());
		System.out.println(Plec.MEZCZYZNA.name());
		System.out.println("Lista dostepnych wartosci");
		for(Plec plec:Plec.values())
		{
			System.out.println(plec);
		}
		

	}

}
