package zadanie2;

public class TestAbstract {

	public static void main(String[] args) {
	//	AbstractLicznik abstract=new AbstractLicznik() {
		LicznikPN pn=new LicznikPN(1,10,1);
		pn.nastepnaWartosc();
		pn.nastepnaWartosc();
		System.out.println(pn.nastepnaWartosc());
			
		//	}
		//};
		/*
		LicznikP1 p1=new LicznikP1();
		LicznikM1 m1=new LicznikM1();
		//LicznikPN pn=new LicznikPN();
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();	
		p1.NastepnaWartosc();
		p1.NastepnaWartosc();
		m1.NastepnaWartosc();
		m1.NastepnaWartosc();
		pn.NastepnaWartosc(4);
		pn.NastepnaWartosc(4);
		pn.NastepnaWartosc(2);
		*/
	//	pn.nastepnaWartosc(1,5);
		//pn.nastepnaWartosc();
		AbstractLicznik licznik=null;
		System.out.println("Wybierz typ licznika");
		System.out.println("1- licznik dodatni");
		System.out.println("2- licznik cykliczny(PN)");
		int opcja=1;
		
		//pn.nastepnaWartosc(1,10,1);
		if(opcja==1)
		{
			licznik=new LicznikP1();
		}
		System.out.println("wcisnij klawisz n  - nowa wartosc; q - wyjscie z programu");
		System.out.println("nowa wartosc licznik to "+licznik.nastepnaWartosc());
		
		
		
		
	}

}
