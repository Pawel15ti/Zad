package typenum;

public class TestZamowienia {

	public static void main(String[] args) {
		
		Zamowienie zamowienie =new Zamowienie();
		System.out.println("Status zamowienia Nowe="+zamowienie.isNowy());
		System.out.println("Status zamowienia W_Trakcie="+zamowienie.isRralizacji());
		System.out.println("Status zamowienia Zakonczone="+zamowienie.isZakonczone());
		zamowienie.oplacZamownienie();
		System.out.println("Status zamowienia Nowe="+zamowienie.isNowy());
		System.out.println("Status zamowienia W_Trakcie="+zamowienie.isRralizacji());
		System.out.println("Status zamowienia Zakonczone="+zamowienie.isZakonczone());
		zamowienie.doreczZamowienie();
		System.out.println("Status zamowienia Nowe="+zamowienie.isNowy());
		System.out.println("Status zamowienia W_Trakcie="+zamowienie.isRralizacji());
		System.out.println("Status zamowienia Zakonczone="+zamowienie.isZakonczone());
	}

}
