package watki.zadanie1;

public class TestParkingu {

	public static void main(String[] args) throws InterruptedException {
		
		Parking parking =new Parking(5);
		
		Thread osobowy=new Thread(new OperacjeWatku(1, parking));
		Thread ciezarowy=new Thread(new OperacjeWatku(2, parking));
		Thread tir = new Thread(new OperacjeWatku(3, parking));
		
		osobowy.setName("osobowy");
		ciezarowy.setName("ciezarowy");
		
		osobowy.start();
		Thread.sleep(100);
		ciezarowy.start();
		Thread.sleep(100);
		tir.start();
		
		osobowy.join();
		ciezarowy.join();
		tir.join();
		
		System.out.println("Liczba miejsc wolnych :"+parking.getIloscMiejscWolnych()+" Liczba miejsc zajetych "+parking.getIloscMiejscZajetych());
		
	}

}
