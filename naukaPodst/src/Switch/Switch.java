package Switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int ocena;
		int poniedzialek, wtorek, sroda, czwartek, piatek, sobota, niedziela;
		poniedzialek = wtorek = sroda = czwartek = piatek = sobota = niedziela = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("podaj oceny jesli chcesz skonczyc wcisnij q:");
		while (sc.hasNextInt()) {
			ocena = sc.nextInt();
			switch (ocena) {
			case 1:
				poniedzialek++;
				break;
			case 2:
				wtorek++;
				break;
			case 3:
				sroda++;
				break;
			case 4:
				czwartek++;
				break;
			case 5:
				piatek++;
				break;
			case 6:
				sobota++;
				break;
			
				
			default:
				niedziela++;
				break;
			}

		}
		System.out.println("Podales tyle razy dni tygodnia:");
		System.out.println("Poniedzialek 1: "+poniedzialek);
		System.out.println("wtorek " +wtorek);
		System.out.println("sroda " +sroda);
		System.out.println("czwartek " + czwartek);
		System.out.println("piatek " +piatek);
		System.out.println("Sobota "+ sobota);
		System.out.println("Inne " +niedziela);
	}

}
