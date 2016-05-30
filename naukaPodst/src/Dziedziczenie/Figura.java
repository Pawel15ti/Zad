package Dziedziczenie;

public abstract class Figura implements Obliczenia{
	
	private String kolor;
	private boolean wypelnienie;
	
	public Figura() {
	this("Czarny",true);
	}
	Figura(String k, boolean w){
		this.kolor=k;
		this.wypelnienie=w;
		
	}
	
//	public double obliczPole(){
//		return 2.0;
//	}
//	public double obliczObwod(){
//		return 2.0;
//	}
	
	public String toString(){
		return "Kolor figury :"+kolor+" Wypelnienie: "+wypelnienie;
	}

}
