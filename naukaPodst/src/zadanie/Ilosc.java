package zadanie;

public abstract class Ilosc extends Produkt{
	
	private double ile;
	
	public Ilosc() {
		super();
		ile=0;
	}
	public Ilosc(String na,double cen, double ile){
		super(na,cen);
		this.ile=ile;
	}
	

	public double getIle() {
		return ile;
	}

	public void setIle(double ile) {
		this.ile = ile;
	}
	

}
