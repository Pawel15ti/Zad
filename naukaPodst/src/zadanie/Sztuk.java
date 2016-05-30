package zadanie;

import java.io.PipedOutputStream;

public abstract class Sztuk extends Produkt{
	//Produkt p= new Sztuk();
	private int sztuk;
	
	public  Sztuk() {
	//String naz = null;
	//int sztuk = 0;
	super();
	sztuk=0;
	//jak do metody mojej dopisaæ parametr sztuk (czyli dopisaæ parametr do metody z klasy nadrzednej?)
	
	}
	public  Sztuk(String nazwa, double cena,int sztu){
		 super(nazwa,cena);
		 sztuk=sztu;
	 }
	
	
	public int getSztuk() {
		return sztuk;
	}
	public void setSztuk(int sztuk) {
		this.sztuk = sztuk;
	}

}
