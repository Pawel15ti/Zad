package zadanie2;

public class LicznikP1 extends AbstractLicznik{

//	AbstractLicznik abstract=new AbstractLicznik();
	@Override
	public int nastepnaWartosc() {
		stanLicznika+=1;
		System.out.println("Licznik =" +stanLicznika);
		return stanLicznika;
	}

	public LicznikP1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LicznikP1(int stanPoczatkowy) {
		super(stanPoczatkowy);
		// TODO Auto-generated constructor stub
	}



}
