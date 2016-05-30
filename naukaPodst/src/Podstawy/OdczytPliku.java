package Podstawy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class OdczytPliku {

	private static final String EOFException = null;

	public static void main(String[] args) throws IOException {
		
		File plik=new File("C:\\Users\\Pawcio\\Desktop\\MistrzJavy1\\test.txt");
		FileReader pliczek=new FileReader(plik);
		
		String[] li=new String[]{"kutanodol","Ala"};
		String lis="Ala";
		
		File plik1=new File("C:\\Users\\Pawcio\\Desktop\\MistrzJavy1\\test1.txt");
		FileWriter zapis=new FileWriter(plik1);
		BufferedWriter bw=new BufferedWriter(zapis);
		
		Scanner sc=new Scanner(System.in);
		BufferedReader bf = new BufferedReader(pliczek);
		if(plik.isFile()){
			System.out.println("Plik istnieje");
		} else
		{
			System.out.println("Plik nie  istnieje!!!");
		}
		
		try {
			String linia=bf.readLine();
			System.out.println("Wprowadz tekst do zapisu");
			String imie=sc.nextLine();
			bw.write(imie);
			
			do{
				System.out.println(linia);
			linia=bf.readLine();
			}while(linia!=EOFException);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			bf.close();
			bw.close();
		}
		
	}

}
