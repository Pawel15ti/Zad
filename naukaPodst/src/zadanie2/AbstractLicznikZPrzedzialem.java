package zadanie2;

public abstract class AbstractLicznikZPrzedzialem extends AbstractLicznik {

	protected int przedzialOd;
	protected int przedzialDo;
	protected int krok;
	public void ustawDane(int a,int b,int c){
		this.przedzialDo=b;
		this.przedzialOd=a;
		this.krok=c;
	}
	
	public AbstractLicznikZPrzedzialem(int przedzialOd, int przedzialDo, int krok) {

		super(0);
		this.przedzialOd = przedzialOd;
		this.przedzialDo = przedzialDo;
		this.krok = krok;
		// this.stanLicznika=0;
		
	}
	
	
}
