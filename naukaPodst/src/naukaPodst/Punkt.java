package naukaPodst;

public class Punkt {
	private int x;
	int y;
	private int z;

	int getX() {
		return x;
	}

	int getY() {
		return y;

	}

	void ustawW(int xx,int yy){
		x=xx;
		y=yy;
	}
	void pobierz (Punkt p){
		//Punkt p=new Punkt();
		//int z;
		p.x=x;
		p.y=y;
		//return p;
		System.out.println(""+p.x);
		System.out.println(""+p.y);}
		Punkt pobierz (){
			Punkt p=new Punkt();
			//int z;
			int z=p.x=x;
		System.out.println(""+z);	
		p.y=y;
		System.out.println(""+y);
		
			return p;
			
	}
	public Punkt(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			ustawW(x, y);
		}

	public Punkt() {
			ustawW(320, 200);;
		}

	void ustawX(int xx){
		x=xx;
	}
	void ustawY(int yy){
		y=yy;
	}
	int pobierzX(){
		System.out.println("x="+x);
		return x;
	}
	int pobierzY(){
		System.out.println("y="+y);
		return y;
	}
}
