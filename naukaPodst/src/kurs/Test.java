package kurs;

public class Test {
	
	public static void Podwojenie (Przeciazanie p){
		
		double pp=p.getPromien();
		pp*=2;
		p.setPromien(pp);
		
	}
	
	
	
	

	public static void main(String args[]){
		
		Przeciazanie kolko=new Przeciazanie(6);
		System.out.println("przed podwo "+kolko.getPromien());
		System.out.println(kolko);
		Podwojenie(kolko);
		System.out.println("Po podwojeniu "+kolko.getPromien());
		System.out.println(kolko);
		
	}

}
