package Rownanie;

public class Rownanie {
	private String wynik;
	private int a;
	private int b;
	private int c;
	
	public void setA(int a){
		this.a=a;
	}
	public void setB(int b){
		this.b=b;
	}
	public void setC(int c){
		this.c=c;
	}
	
	public Rownanie(){
		this(0,0,0);
	}
	public Rownanie(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public String Licz(){
		double delta;
		double x1,x2;
		wynik="";
        if(a==0){
            wynik="To nie jest funkcja kwadratowa";
        }else{
            delta=b*b-4*a*c;
            if (delta<0){
               wynik="Brak rozwi¹zañ.";
            }if(delta==0){
            	x1=(-b/(2*a));
            wynik="Równanie ma 1 pierwiastek, x1 = " + x1 ;
            }if(delta>0){
            	x1=(-b-Math.sqrt(delta))/(2*a);
            	x2=(-b+Math.sqrt(delta))/(2*a) ;
                wynik="Równanie ma 2 pierwiastki, x1 = " + x1 +" x2= "+x2;
            }
        }
        return wynik;
	}
	
public String toString(){
	return "Rownanie wyglada nastepujaco "+ a+"*x^2 +"+b+"x+"+""+c;
}


}
