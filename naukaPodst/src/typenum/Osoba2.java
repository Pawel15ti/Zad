package typenum;

public class Osoba2 {

	private Plec plec;
	
	public Osoba2(Plec plec)
	{
		this.plec=plec;
	}
	
	public boolean isKobieta()
	{
		return plec==Plec.KOBIETA;
	}
	
	public boolean isMezczyzna()
	{
		return plec==Plec.MEZCZYZNA;
	}
}
