package naukaPodst;

import javax.sql.rowset.RowSetWarning;

public class Tablica {

	public static void main(String[] args) {
//int tab[]=new int[10];
//tab[0]=88;
//System.out.println(tab[10]);
		System.out.println("dzialam");
		Rownanie(1, 4, 4);
		Niepodzielne(20);
		Niepodzielne2(10);
		Niepodzielne3(1);
		
		int tab[]=new int[10];
		int s=3;
		for(int i=0;i<10;i++){
			tab[i]=s++;
		}
		for(int t:tab){
			System.out.println(t+" tablica");
		}
			
				
					
					
			
		
		
		int x=1,y;
		System.out.println(++x);
		System.out.println(x++);
	//	System.out.println(x++);
		System.out.println(x);
	y=x++;
	System.out.println("x "+x);
	System.out.println(y);
	y=++x;
	System.out.println(y);
int a,d,c;
a=8;
d=3;
c=10;
System.out.println("a/b:"+a/d);
System.out.println("a/c:"+a/c);
System.out.println("b/c:"+d/c);
byte zm=127;
zm+=3;
System.out.println(zm);
int dd=134;
int ee=0;
d=d>>2;
System.out.println();
	}
	
	public static void Rownanie(int ff, int fff ,int ffff){
		System.out.println("a , b, c ="+ff+" "+fff+" "+ffff);
		if(fff==0){
			System.out.println("to nie jest rownanie kwadratowe");
		}else{
			int delta = fff*fff-4*ff*ffff;
			if(delta<0){
				System.out.println("nie ma pierwiastkow");
			}else if(delta==0){
				System.out.println("Wynik 1 delta * delta="+(delta*delta));
			}else{
				System.out.println("Dwa pierwiastki");
			}
	}
	}
	public static void Niepodzielne(int a){
	for (a=1;a<=20;a++)
	{
		if(a%2!=0)
		{
			System.out.println(a);
		}
	}
	}
	
	public static void Niepodzielne2(int a){
		a=1;
	while(a<=10)
	{
		
		{
			System.out.println(a+"Java");
			a++;
		}
	}
	}
	public static void Niepodzielne3(int b){
		
		while(b<=20)
		{
			if(b%2!=0)
			
				System.out.println("while "+b);
				b++;
			
		}
		}
	
}
