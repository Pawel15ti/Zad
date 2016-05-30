package zadanie;

import java.util.Scanner;

public class Cebula extends Ilosc{

	private String gatunek;
	
	public Cebula(String na, double cen, double ile,String gatunek) {
		super(na, cen, ile);
		this.gatunek=gatunek;
	}

	@Override
	public String toString() {
		return "Cebula [gatunek=" + gatunek + "]";
	}

	
	
	
	

}
