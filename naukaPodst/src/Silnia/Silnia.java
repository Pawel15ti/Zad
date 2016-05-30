package Silnia;

import java.math.BigInteger;
import java.util.Scanner;

public class Silnia {

	public static  BigInteger SilniaMala(int a){
		int liczba1=a;
		
	//	int b=1;
	BigInteger silnia=	BigInteger.valueOf(1);
		for(int i=1;i<=liczba1;i++)
		{
			silnia=silnia.multiply(BigInteger.valueOf(i));
			
			
		}
		
		
		return silnia;
	}

	
	
	public static void main(String[] args) {
	//	int liczba=0;
	//	System.out.println(SilniaMala(120));
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "jakie jest prawdopodobieñstwo trafienia szóstki?? ");
		System.out.println("podaj liczbe 6");
		int a=sc.nextInt();
		
		System.out.println("Podaj zakres losowanych liczb z przedzialu ");
		int b=sc.nextInt();
		
		BigInteger wynik=SilniaMala(b).divide(SilniaMala(a).multiply(SilniaMala(b-a)));
		
		//BigInteger wynik=BigInteger.valueOf(0);
		System.out.printf( "A o to wynik : %,d" ,wynik);
		
		

	}

}
