package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObslugaWyjatku {
	// ExceptionWW ex=new ExceptionWW();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	boolean nieprawda=true;
		do{
		try {
			
			System.out.println("Podaj mianownik");
			int a = sc.nextInt();
			System.out.println("Podaj licznik");
			int b = sc.nextInt();
		
		//	if(b==0){
			//	throw new ExceptionWW("huj");
			//}
			System.out.println("Wynik wynosi :" + a / b);
			
		
			nieprawda=false;
		} catch (InputMismatchException ime) {
			//ime.printStackTrace();
			sc.nextLine();
			System.out.println("Wprowadzi³eœ b³êdne dane wejsciowe");
		}catch(ArithmeticException ae){
			System.out.println("B³êdne dane wprowadz jeszcze raz");
		}
	
		}
		while(nieprawda);
		sc.close();
	}

}
