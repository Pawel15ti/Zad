package zadanie2;
//1 <0,100>;krok=10-> 0,10,20,30,40,50,60,70,80,90,100,10,20
//2 <0,100>;krok=20->0,20,40,60,80,100,80,60,40,20,0,20
public abstract class AbstractLicznik {
	//int krok;
	protected  int stanLicznika;
	
	public abstract int nastepnaWartosc();
	//JakasKlasa obiekt=new JakasKlasa("imie","nazwisko","kobieta","Finanse","Mgr")
	//JakasKlasa obiekt=new JakasKlasa();
	//obiekt.setImie("imie")
	//obiekt.setNazwisko("naziwsko")
	public AbstractLicznik(int stanPoczatkowy){
		stanLicznika=stanPoczatkowy;
	}
	

	public AbstractLicznik() {
		stanLicznika=0;
	}
	
	


	@Override
	public String toString() {
		return "AbstractLicznik [stanLicznika=" + stanLicznika + "]";
	}

	public int nastepnaWartosc1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
