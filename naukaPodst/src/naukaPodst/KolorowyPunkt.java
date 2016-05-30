package naukaPodst;

public class KolorowyPunkt extends Punkt{
	protected int kolor;
	public KolorowyPunkt() {
	super();
	kolor=0;
	}
	KolorowyPunkt(int wx,int wy, int nKolor){
		super(wx,wy);
		kolor=nKolor;
	}
	public void ustawKolor(int nKolor){
		kolor=nKolor;
	}
	public int pobierzKolor(){
		
		return kolor;
	}
}
