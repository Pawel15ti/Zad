package Dziedziczenie;

public class TestFigura {

	public static void main(String[] args) {
		Kolo kolo=new Kolo();
		Kolo kolo1=new Kolo(40);
		Prostokat prostokat=new Prostokat();
		Prostokat prostokat1=new Prostokat(5,10,"Bezowy",false);
		//Figura figura=new Figura();
		
		Figura[] tab=new Figura[5];
		tab[0]=new Kolo();
		tab[1]=new Kolo(40);
		tab[2]=new Prostokat();
		tab[3]=new Prostokat(5,10,"Bezowy",false);
		tab[4]=new Prostokat();
		for(Figura x:tab){
			//System.out.println(x);
			{
				System.out.println("Obwod wynosi : "+x.obliczObwod());
				System.out.println("Pole wynosi : "+x.obliczPole());
			}
			
			//if(x instanceof Kolo)
//			{	System.out.println(((Kolo) x).obliczPole());
//			}//System.out.println(tab[2].obliczObwod());
//			else if(x instanceof Prostokat)
//				{System.out.println(((Prostokat)x).obliczPole());
//				}
		}
		
	}

}
