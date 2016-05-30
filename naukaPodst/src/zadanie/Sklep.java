package zadanie;

import zadanie.Produkt;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import zadanie.Cebula;

public class Sklep {

	public static void main(String[] args) throws IOException {
		// int e=5;
		int ile = 0;

		Produkt maslo1 = new Maslo();
		Sztuk kap1=new Kapusta();

		/*
		Produkt cebula11 = new Produkt();
		cebula11.setId(2);
		cebula11.setNazwa("Cebula");
		//>>>>>>>>>>>>>>>cebula11.setIlosc(5);
		cebula11.setCena(1.20);
		*/
		Set<Produkt> mySet = new HashSet<Produkt>();
		// mySet.add(cebula1);

		// mySet.add(cebula2);

		// mySet.add(maslo1);
		int wybor = menu();
		while (wybor != 0) {
			switch (wybor) {
			case 1:

				mySet.add(Cebulaa());
				System.out.println("Doda�e� cebul�");
				break;
			case 2:
				Scanner sc = new Scanner(System.in);
				boolean contains = mySet.contains(maslo1);
				if (!contains) {

					mySet.add(Masloo(maslo1));
				}
				System.out.println("Doda�e� mas�o");
				if(contains) {
					int a=menu1();
				
					while (a != 0) {
						switch (a) {
						case 1:

							System.out.println("Podaj ile sztuk mas�a chcesz doda�:");

							//>>>>>>>>>>>>>>>maslo1.setIloscSztuk(maslo1.getIloscSztuk() + sc.nextInt());

							break;
						case 3:
							//>>>>>>>>>>>>>>>System.out.println("Ile jest sztuk mas�a w magazynie" + maslo1.getIloscSztuk());
							break;

						case 2:
							//>>>>>>>>>>>>>>>System.out.println("W magazynie jest :"+maslo1.getIloscSztuk()+ " sztuk mas�a");
							System.out.println("Ile chcesz kupi�(zabra� sztuk mas�a?  ");
							Integer liczb = Integer.parseInt(sc.nextLine());
							//>>>>>>>>>>>>>>>int m = maslo1.getIloscSztuk();
							//>>>>>>>>>>>>>>>if(m<liczb){
							//>>>>>>>>>>>>>>>	System.out.println("za ma�o sztuk mas�a w magazynie");
							//>>>>>>>>>>>>>>>}else{
							//>>>>>>>>>>>>>>>int mm=m - liczb;
							//>>>>>>>>>>>>>>>maslo1.setIloscSztuk(mm);
							//maslo1.setIlosc(m - liczb);
							//>>>>>>>>>>>>>>>System.out.println("po zabraniu zosta�o :" + maslo1.getIloscSztuk() + " zabra�e�:" + liczb);
							//>>>>>>>>>>>>>>>}
							break;
						case 0:
							System.out.println("Wyjscie z kategorii");
							wybor=0;
							break;
						default:
							System.out.println("Wybra�e� nieodpowiedni numer");
						}
					
						a = menu1();
					}
						
					
				}
				break;
			case 3:
				mySet.add(Sokk());
				System.out.println("Doda�e� sok");
				break;
			case 4:
				mySet.add(Nowy());
				System.out.println("Doda�e� produkt");
				break;
			case 5:
				for (Produkt my : mySet) {
					System.out.println(my);
				}
				break;
			case 6:
				System.out.println("liczba produkt�w w bazie :" + mySet.size());
				break;
			case 7:
				// Produkt maslo=new Maslo();
				System.out.println("ilosc mas�a :" + mySet.toString());
				break;
			case 8:
				Scanner sc1=new Scanner(System.in);
				//Scanner sc = new Scanner(System.in);
				boolean containss = mySet.contains(kap1);
				if (!containss) {
					System.out.println("podaj ile doda� kapusty ");
					Integer liczb = Integer.parseInt(sc1.nextLine());
					
					mySet.add(Kapustka((Kapusta) kap1));
					kap1.setSztuk(liczb);
				}
				System.out.println("Doda�e� kapuste");
				if(containss) {
					int a=menu1();
				
					while (a != 0) {
						switch (a) {
						case 1:

							System.out.println("Podaj ile sztuk kapusty chcesz doda�: ");
							kap1.setSztuk(kap1.getSztuk()+sc1.nextInt());
							//kap1.s(kap1.get.getIloscSztuk() + sc1.nextInt());

							break;
						case 3:
							System.out.println("Ile jest sztuk kapusty w magazynie " + kap1.getSztuk());
							break;

						case 2:
							System.out.println("W magazynie jest : "+kap1.getSztuk()+ " sztuk kapust ");
							System.out.println("Ile chcesz kupi�(zabra� sztuk kapust?  ");
							Integer liczb = Integer.parseInt(sc1.nextLine());
							int m = kap1.getSztuk();
							if(m<liczb){
								System.out.println("za ma�o sztuk kapust w magazynie ");
							}else{
							int mm=m - liczb;
							kap1.setSztuk(mm);
							//maslo1.setIlosc(m - liczb);
							System.out.println("po zabraniu zosta�o : " + kap1.getSztuk() + " zabra�e�: " + liczb);
							}
							break;
						case 4:
							System.out.println("--------------------------------------------------------------");
							System.out.println("liczba produkt�w w bazie :" + mySet.size());

							for (Produkt my : mySet) {
								System.out.println(my);
							}
								break;
						case 0:
							System.out.println("Wyjscie z kategorii");
							wybor=0;
							break;
						default:
							System.out.println("Wybra�e� nieodpowiedni numer");
						}
					
						a = menu1();
					}
						
					
				}
				break;
			case 9:
				// String[] tablica = mySet.toArray(new String[mySet.size()]);
				String[] array = mySet.toArray(new String[0]);
				for (String s : array) {
					System.out.println(s);
				}
				break;
			case 0:
				System.out.println("Wyjscie z kategorii");
				//wybor=4;
				break;
			// System.out.println("ilosc mas�a :"+Masloo().getIloscSztuk());
			// break;
			default:
				System.out.println("Wybra�e� nieodpowiedni numer");

			}
			System.out.println("\n Wcisnij Enter aby kontynuowa�..");
			System.in.read();
			wybor = menu();
		}

		System.out.println("************************************");
		System.out.println("\n Koniec programu \n \n");
		// double i=20;

		/*
		 * System.out.println(cebula11);
		 * 
		 */
		System.out.println("--------------------------------------------------------------");
		System.out.println("liczba produkt�w w bazie :" + mySet.size());

		for (Produkt my : mySet) {
			System.out.println(my);
		} /*
			 * //double il=cebula11.getIlosc()+i;
			 * //sok.setIloscSztuk(sok.getIloscSztuk()+2);
			 * cebula11.setIlosc(cebula11.getIlosc()+6); cebula11.getIlosc();
			 * System.out.println(
			 * "--------------------------------------------------------------")
			 * ; System.out.println(cebula11); System.out.println(
			 * "--------------------------------------------------------------")
			 * ; for (Produkt my:mySet){ System.out.println(my); }
			 * 
			 * 
			 * //mySet.remove(cebula); mySet.remove(cebula11);
			 * //mySet.remove(sok); //mySet.remove(maslo1);
			 * mySet.remove(cebula11); mySet.remove(cebula11);
			 * mySet.remove(cebula11); mySet.remove(cebula11);
			 * mySet.remove(cebula11); //
			 * sok.setIloscSztuk(sok.getIloscSztuk()-3); System.out.println(
			 * "--------------------------------------------------------------")
			 * ; System.out.println("liczba produkt�w w bazie :"+mySet.size());
			 * for (Produkt my:mySet){ System.out.println(my); }
			 * 
			 * 
			 * }
			 */
	}

	public static Cebula Cebulaa() {
		Produkt cebula = new Cebula("dsad",1,1,"asdas");
		// int sztuk = 0;
		// String naz = null;
		// double cena = 0;
		// cebula.produkt1(naz, sztuk, cena);
		// System.out.println("Podaj ile chcesz doda� cebuli do magazynu:");
		Scanner sc = new Scanner(System.in);
		// char character = 't';
		// int ascii = (int) character;
		cebula.setNazwa("Cebula");
		System.out.println("Podaj ile chcesz doda� cebuli do magazynu:");
		//>>>>>>>>>>>>>>>cebula.setIlosc(cebula.getIlosc() + sc.nextDouble());
		sc.nextLine();
		System.out.println("Czy chcesz zmieni� cen� cebuli wci�nij 1:");
		// sc.nextDouble()
		// char character = name.charAt(84);
		// boolean ch=sc.hasNextLine();
		Integer ss = Integer.parseInt(sc.nextLine());
		if (ss == 1) {
			System.out.println("Podaj nowa cene z , a nie .");

			cebula.setCena(sc.nextDouble());
		} else {
			cebula.setCena(1.2000000);
			System.out.println(cebula);
		}
		return (Cebula) cebula;

	}

	public static Maslo Masloo(Produkt maslo1) {

		Scanner sc = new Scanner(System.in);

		maslo1.setId(3);
		maslo1.setNazwa("Maslo");
		System.out.println("podaj ile chcesz dodac sztuk mas�a:");

		//>>>>>>>>>>>>>>>maslo1.setIloscSztuk(maslo1.getIloscSztuk() + sc.nextInt());
		maslo1.setCena(3.10);
		System.out.println(maslo1);
		return (Maslo) maslo1;
	}

	public static Sok Sokk() {
		Produkt sok = new Sok();
		Scanner sc = new Scanner(System.in);
		sok.setId(4);
		sok.setNazwa("Sok");
		System.out.println("podaj ile chcesz dodac sztuk soku:");
		//>>>>>>>>>>>>>>>sok.setIloscSztuk(sok.getIloscSztuk() + sc.nextInt());
		sok.setCena(6.10);
		System.out.println(sok);
		return (Sok) sok;
	}

	public static NowyProdukt Nowy() {
		Produkt produkt = new NowyProdukt();
		Scanner sc = new Scanner(System.in);
		int i = 5;
		produkt.setId(i);
		i = i + 1;
		System.out.println("Podaj nazwe produktu:");
		produkt.setNazwa(sc.nextLine());
		sc.nextLine();
		System.out.println("podaj ile chcesz dodac ilosci produktu:");
		//>>>>>>>>>>>>>>>produkt.setIlosc(produkt.getIlosc() + sc.nextDouble());
		System.out.println("podaj cene produktu:");
		produkt.setCena(sc.nextDouble());
		System.out.println(produkt);
		return (NowyProdukt) produkt;
	}

	public static void Lista(Set mySet) {
		// Produkt pro=new Produkt();
		for (Object p : mySet) {
			System.out.println(p);
		}
	}

	public static int menu() {
		System.out.println("Co chcesz zrobi�:");
		System.out.println("------------------------------------------------------------");
		System.out.println("1-Doda� cebul� do magazynu     2-Doda� mas�o do magazynu");
		System.out.println("------------------------------------------------------------");
		System.out.println("3-Doda� sok do magazynu        4-Doda� nowy produkt do magazynu");
		System.out.println("5-Wyswietl wszystkie produkty  6-Liczba produkt�w w bazie");
		System.out.println("7-Wy�wietl info o ilo�ci mas�a       8-Doda� kapuste do magazynu");

		System.out.println("------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		return a;

	}
	public static int menu1(){
		
		System.out.println("Co chcesz teraz zrobi�?");
		System.out.println("1-doda�  do magazynu");
		System.out.println("2-kupi� z magazynu");
		System.out.println("3-sprawdzi� ile jest  w magazynie");
		System.out.println("4-Wzswietl wsyzstkie produkty");
		System.out.println("0-Wyj��");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		return a;
	}
	public static Kapusta Kapustka(Kapusta kap1){
		//Kapustka(kap1);
	//	Kapusta kap=new Kapusta();
		//nie mam mozliwosci pobierania danych dotyczacych klasy Kapusta dlaczego ?
		
		
		kap1.setNazwa("Kapusta");
		kap1.setGatunek("Bia�a");
		kap1.setSztuk(15);
		kap1.setCena(1.90);
		//kap1.setIlosc(ilosc); dlaczego ma dost�p do pola z klasy kt�rej nie dziedziczy?
		return kap1;
		
	}
}
