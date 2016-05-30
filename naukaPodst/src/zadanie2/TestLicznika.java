package zadanie2;

import java.util.Scanner;

public class TestLicznika {

	public static void main(String[] args) {
	//0,59 ,1 -> 0,..58,59,58,57,...0  => LicznikOdbijajacy tmp-przedzialDO=reszta => stanlicznik=przedzialDo-reszta
		//int a =-1;
		//int a=1;
		//AbstractLicznikZPrzedzialem licznik1=new LicznikOdbijajacy();
		int wybor = menu1();
		//wybor=a;
		while (wybor != 0) {
			switch (wybor) {
			case 1:
				
		AbstractLicznikZPrzedzialem licznik2=new LicznikZegarowy();//2,3,4
	Licznik2(licznik2);
		for(int i=0;i<=70;i++){
			System.out.println(licznik2.nastepnaWartosc());
			System.out.println("");
		}break;
			case 2:
				AbstractLicznikZPrzedzialem licznik1=new LicznikOdbijajacy();
				Licznik1(licznik1);
		
		for(int i=0;i<=16;i++){
			System.out.println("Licznik odbijajacy :"+licznik1.nastepnaWartosc());
			System.out.println("");
		}break;
			case 0:
				System.out.println("Wyjscie z programu");
				wybor=0;
				break;
			default:
				System.out.println("Wybra³eœ nieodpowiedni numer");
			}
		
		wybor= menu1();}
System.out.println("wyjscie z programu!!");
	}
public static int menu1(){
		
		System.out.println("Co chcesz teraz zrobiæ?");
		System.out.println("1-Licznik zegarowy");
		System.out.println("2-Licznik Odbijajacy");
		//System.out.println("3-sprawdziæ ile jest  w magazynie");
		//stem.out.println("4-Wzswietl wsyzstkie produkty");
		System.out.println("0-Wyjœæ");
		Scanner sc = new Scanner(System.in);

		int wybor = sc.nextInt();
		return wybor;
	}

/*public static AbstractLicznikZPrzedzialem Licznik(AbstractLicznikZPrzedzialem licznik1){
	Scanner sc = new Scanner(System.in);
	//System.out.println("Co chcesz teraz zrobiæ?");
	//System.out.println("1-Licznik zegarowy");
	System.out.println("2-Licznik Odbijajacy");
	licznik1.s
	//System.out.println("3-sprawdziæ ile jest  w magazynie");
	//stem.out.println("4-Wzswietl wsyzstkie produkty");
	System.out.println("0-Wyjœæ");
	Scanner sc = new Scanner(System.in);

	int wybor = sc.nextInt();
	return licznik1;
}*/
public static AbstractLicznikZPrzedzialem Licznik1(AbstractLicznikZPrzedzialem licznik1){
	Scanner sc = new Scanner(System.in);
	//System.out.println("Co chcesz teraz zrobiæ?");
	//System.out.println("1-Licznik zegarowy");
	System.out.println("2-Licznik Odbijajacy");
	System.out.println("");
	int a=0;
	int b=0;
	int c=0;
	System.out.println("");
	System.out.println("Podaj zakres dolny:");
	a=sc.nextInt();
	System.out.println("");
	System.out.println("Podaj zakres górny:");
	b=sc.nextInt();
	System.out.println("");
	System.out.println("Podaj krok licznika:");
	c=sc.nextInt();
	System.out.println("");
	licznik1.ustawDane(a, b, c);
	//System.out.println("3-sprawdziæ ile jest  w magazynie");
	//stem.out.println("4-Wzswietl wsyzstkie produkty");
	//System.out.println("0-Wyjœæ");
	//Scanner sc = new Scanner(System.in);

	//int wybor = sc.nextInt();
	return licznik1;
}

public static AbstractLicznikZPrzedzialem Licznik2(AbstractLicznikZPrzedzialem licznik2){
	Scanner sc = new Scanner(System.in);
	//System.out.println("Co chcesz teraz zrobiæ?");
	//System.out.println("1-Licznik zegarowy");
	System.out.println("2-Licznik Odbijajacy");
	System.out.println("");
	int a=0;
	int b=0;
	int c=0;
	System.out.println("");
	System.out.println("Podaj zakres dolny:");
	a=sc.nextInt();
	System.out.println("");
	System.out.println("Podaj zakres górny:");
	b=sc.nextInt();
	System.out.println("");
	System.out.println("Podaj krok licznika:");
	c=sc.nextInt();
	System.out.println("");
	licznik2.ustawDane(a, b, c);
	//System.out.println("3-sprawdziæ ile jest  w magazynie");
	//stem.out.println("4-Wzswietl wsyzstkie produkty");
	//System.out.println("0-Wyjœæ");
	//Scanner sc = new Scanner(System.in);

	//int wybor = sc.nextInt();
	return licznik2;
}
}
