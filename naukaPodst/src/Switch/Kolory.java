package Switch;

public class Kolory {
	public enum Kolor{
		Czerwony,Zielony,Czarny;
	}
	
	public static void main(String args[]){
		Kolor k=Kolor.Zielony;
		
		switch (k) {
		case Czerwony:
			System.out.println("kolor czerwony");
			break;
case Czarny:
	System.out.println("kolor czarny");
			
			break;
		default:
			System.out.println("kolor inny");
			break;
		}
		
	}

}
