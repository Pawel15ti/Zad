package typenum;

public class Osoba {

	public static final int PLEC_KOBIETA=0;
	public static final int PLEC_MEZCZYZNA=1;
	
	private int plec;
	
	public Osoba(int plec)
	{
		this.plec=plec;
	}
	
	public boolean isKobieta()
	{
		return plec==PLEC_KOBIETA;//plec.equals("Kobieta") problem jest gdy plec=kobieta
	}
	
	public boolean isMezczyzna()
	{
		return plec==PLEC_MEZCZYZNA;
	}
	
	
}
