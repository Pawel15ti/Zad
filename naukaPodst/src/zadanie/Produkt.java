package zadanie;

public abstract class Produkt {
	
	private int id;
	private String nazwa;
	protected double cena;
	public Produkt(String nazwa, double cena) {
		
		this.nazwa=nazwa;
		this.cena=cena;
	}
	public Produkt(){
		
	}
//public void Sztuk(String naz, double cena) {
	
		
//	}
	
	public void produkt1(String naz, int sztuk, double cena) {
	
		
	}
	public void produkt1(String naz,double sztuk,double cena) {
	
	}
	
	
	





	@Override
	public String toString() {
		return "Produkt [id=" + id + ", nazwa=" + nazwa + ", , cena="
				+ cena + "]";
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produkt other = (Produkt) obj;
		if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
			return false;
		if (id != other.id)
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		return true;
	}



	
	
	
	

}
