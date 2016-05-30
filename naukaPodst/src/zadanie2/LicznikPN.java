package zadanie2;
//od=10 do 100 stan poczatkowy=od, krok=20 10,30,50,70,90,20,40,60,80,100,30,50,70,90,20   
public class LicznikPN extends AbstractLicznik{

	private int krok;
	private int stanKoncowy;
	public LicznikPN() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int nastepnaWartosc() {
		stanLicznika+=krok;
		
		
		return stanLicznika;
	}
//	@Override
//	public int nastepnaWartoscKoncowa() {
	//	stanLicznika+=krok;
		
		
		//return stanLicznika;
	//}
	//@Override
//	public int nastepnaWartosc1() {
	//	stanLicznika+=krok;
		
		
		//return stanLicznika;
	//}

	public LicznikPN(int krok) {
		super();
		this.krok=krok;
	}
	
	
	//public LicznikPN(int krok, int stanKoncow){
		//super();
		//this.krok=krok;
		//this.stanKoncowy=stanKoncow;
//	}
	public LicznikPN(int stanPoczatkowy,int krok) {
		super(stanPoczatkowy);
		this.krok=krok;
		// TODO Auto-generated constructor stub
	}
	public LicznikPN(int stanPoczatkowy,int stanKoncowy, int krok){
	super(stanPoczatkowy);
	this.krok=krok;
	this.stanKoncowy=stanKoncowy;
	
	}
}
