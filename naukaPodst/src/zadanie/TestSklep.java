package zadanie;

public class TestSklep {

	public static void main(String[] args) {

		SklepWielobranzowy sklep=new SklepWielobranzowy();
		Cebula cebula=new Cebula("Slodka", 1.9, 1500, "Duza");
		Kapusta kapusta=new Kapusta("Bia³a", 2.9, 1000, "aA");
		sklep.dodajProdukt(cebula);
		System.out.println(sklep.wartoscProduktow());
		sklep.dodajProdukt(kapusta);
		System.out.println(sklep.wartoscProduktow());
		
	}

}
