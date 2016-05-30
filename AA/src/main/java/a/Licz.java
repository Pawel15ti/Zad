package a;

public class Licz {
	private int a=0;
	private int b=0;
	public Licz() {
		this.a=1;
	}

	public  double liczymy(int a,int b){
		System.out.println("Licze sume:");
	return a+b;	
	}

	@Override
	public String toString() {
		return "Licz [a=" + a + ", b=" + b + "]";
	}
	
	
}
