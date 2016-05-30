package Rownanie;

import java.util.Scanner;



public class TestRownanie {
	
	public static void Œrednia(int...var){
		double suma=0;
		for(int x:var){
			suma=suma+x;
		}
		double srednia=0;
		srednia=suma/var.length;
		System.out.println(srednia);
	}
	
	public static void main(String args[]){
		int a;
		int b;
		int c;
		
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Podaj parametry a,b,c");
		
	//	a=sc.nextInt();
	//	b=sc.nextInt();
	//	c=sc.nextInt();
		
		
		/*	
			Rownanie rownanie=new Rownanie(a,b,c);
			System.out.println(rownanie);
			System.out.println(rownanie.Licz());
			rownanie.setA(100);
			
			System.out.println(rownanie);
			System.out.println(rownanie.Licz());*/
		
			Œrednia(1,2,3,4,5,6,10);
	}

}
