package zadanie2;

public class LicznikM1 extends AbstractLicznik{

	@Override
	public int nastepnaWartosc() {
		stanLicznika-=1;
		System.out.println("Stan Licznika ="+stanLicznika);
		return stanLicznika;
	}

	public LicznikM1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LicznikM1(int stanPoczatkowy) {
		super(stanPoczatkowy);
		// TODO Auto-generated constructor stub
	}


}
