package Podstawy;

import java.io.File;
import java.io.IOException;

public class OperacjePliki {
	public static void main(String [] args) throws IOException{
		File plik=new File("C:\\Users\\Pawcio\\Desktop\\kod1.txt");
		boolean jest=plik.exists();
		File[] lista;
		if(jest!=false){
			System.out.println("Istnieje plik");
		}else{
			System.out.println("plik nie istnieje");
		}
		File plik2=new File("C:\\Users\\Pawcio\\Desktop\\MistrzJavy1");
		File plik1=new File("C:\\Users\\Pawcio\\Desktop\\MistrzJavy1//Java.txt");
	
		//plik1.createNewFile();
		boolean p=plik2.mkdirs();
		if(p==true){
			System.out.println("Utworzono plik");
		} else{
			System.out.println("Nie utworzono pliku");
		}
		lista=plik2.listFiles();
		for(File l:lista){
			System.out.println(" lista "+ l);
			
		}
		System.out.println(lista);
	}

}
