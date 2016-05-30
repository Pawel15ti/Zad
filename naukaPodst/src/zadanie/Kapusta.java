package zadanie;

public class Kapusta extends Sztuk{
	private String gatunek;
	public Kapusta() {
	super();
	gatunek=null;
	}
	Kapusta(String n,double cena,int sztuk,String gat){
		super(n,cena,sztuk);
		gatunek=gat;
	}
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	

}
