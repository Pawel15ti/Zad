package Dziedziczenie;

public class Kolo extends Figura{
	private double promien;
	
	public Kolo() {
	this(1.0);
	}
	public Kolo(double r) {
	
		this(r,"Zie",false);
	}
	public Kolo(double r,String k,boolean w) {
		super(k,w);
		this.promien=r;
	}
	public double obliczObwod(){
		return 2*Math.PI*promien;
	}
	public double obliczPole(){
		return Math.PI*Math.pow(promien, 2);
	}
	public String toString(){
		return "Figura "+getClass().getName()+" Promien wynosi: " + promien+ " Pole kola wynosi : "+ obliczPole()+ " obwod kola wynosi: "+ obliczObwod()+ super.toString();
	}

	

}
