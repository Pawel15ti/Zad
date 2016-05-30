package typenum;

public class Zamowienie {
	private StatusZamownienia status;
	private boolean oplacone;
	
	public Zamowienie() {
		super();
		this.oplacone=false;
		this.status=StatusZamownienia.NOWE;
	}
	
	public void oplacZamownienie(){
		oplacone=true;
		status=StatusZamownienia.W_TRAKCIE_REALZIACJI;
	}
	public void doreczZamowienie(){
		status=StatusZamownienia.ZAKONCZONE;
	}
	public boolean isNowy(){
		return status==StatusZamownienia.NOWE;
	}
	public boolean isRralizacji(){
		return status==StatusZamownienia.W_TRAKCIE_REALZIACJI;
		
	}
	public boolean isZakonczone(){
		return status==StatusZamownienia.ZAKONCZONE;
	}
}
