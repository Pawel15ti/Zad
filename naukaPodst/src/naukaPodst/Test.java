package naukaPodst;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Punkt punktt=new Punkt();
Punkt punkttPomocniczy=new Punkt();
System.out.println(punktt.getX());
//System.out.println(punktt.x);
System.out.println(punktt.getY());
//punktt.ustawW(5, 6);
punkttPomocniczy.ustawW(3, 5);
//punkttPomocniczy=punktt.pobierz();
//System.out.println(""+punkttPomocniczy.pobierz().x+" "+punkttPomocniczy.pobierz().y);	
punktt.ustawW(1, 1);
//punkttPomocniczy=punktt.pobierz();
//System.out.println(""+punkttPomocniczy.pobierz().x+" "+punkttPomocniczy.pobierz().y);	
System.out.println("Teraz");
punktt.pobierz(punktt);
punktt.pobierzX();
punktt.pobierz();

Punkt p = new Punkt();
p.pobierz();
Punkt pp = new Punkt(100,500);

pp.pobierz();
//pp.x=8;
System.out.println("KOLORY!!");

KolorowyPunkt kol=new KolorowyPunkt(10,20,3);
System.out.println(kol.getX());
System.out.println(kol.getY());
System.out.println(kol.pobierzKolor());
kol.ustawKolor(6);
System.out.println(kol.pobierzKolor());
System.out.println("----------------");
System.out.println();
kol.pobierz(kol);
punktt.pobierz();
	}
	

}
