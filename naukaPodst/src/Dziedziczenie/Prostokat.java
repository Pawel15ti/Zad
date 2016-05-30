package Dziedziczenie;

public class Prostokat extends Figura{
	private double a;
	private double b;
	public Prostokat() {
	this(1.0,1.0);
	
	}
	public Prostokat(double a,double b){
		super("Czerwony",true);
		this.a=a;
		this.b=b;
	}
	
	public Prostokat(double a,double b,String k,boolean w){
		super(k,w);
		this.a=a;
		this.b=b;
	}
	public double obliczPole(){
		return a*b;
	}
	public double obliczObwod(){
		return a*2+2*b;
	}

	public String toString(){
		return "Figura "+getClass().getName()+" o boku a= "+a+ " , boku b= "+b+" obwod prostokata wynosi :"+obliczObwod()+" pole prostokata wynosi : "+obliczPole()+super.toString();
	}
	

}
