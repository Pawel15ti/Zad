package zadanie;

import java.util.HashSet;
import java.util.Set;

public class SklepWielobranzowy {

	private Set<Produkt> produkty;

	public SklepWielobranzowy() {
		produkty = new HashSet<Produkt>();

	}

	public void dodajProdukt(Produkt produkt) {
		produkty.add(produkt);
	}

	public double wartoscProduktow() {
		double suma = 0;
		for (Produkt produkt : produkty) {
			System.out.println("------"+produkt);
			if(produkt instanceof Ilosc){
				Ilosc ilosc=(Ilosc)produkt;
				suma+=ilosc.getIle()*ilosc.getCena();
			}
			else if(produkt instanceof Sztuk){
				Sztuk sztuk=(Sztuk)produkt;
				suma+=sztuk.getSztuk()*sztuk.getCena();
			} else{
				throw new IllegalArgumentException("Produkty na liscie powinny dziedziczyc po klasie ilosc lub sztuk");
			}
			
			
		}

		return suma;
	}
	//wypiszProdukty(Cebula.class)
	public void wypiszProdyktyTypu(Class clazz)
	{
		
		for (Produkt produkt : produkty) {
			if(produkt.getClass()==clazz)
			{
				System.out.println(produkt);
			}
		}
	}

}
