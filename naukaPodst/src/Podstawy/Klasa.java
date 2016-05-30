package Podstawy;

import java.io.File;

public class Klasa {
	public static void main(String[] args){
		  String x = "Ola";
		  
		   // System.out.println("x: " + x);
		 
		    someOp(x);
		  
		    //System.out.println("x: " + x);
	}
		  
		 
//		int xx=0;
//		System.out.println(x++ +" "+ ++x +""+ x++ + ""+ ++x);
//		System.out.println(x++);
//		System.out.println(x);
//		File plik=new File("C:\\Users\\Pawcio\\Desktop\\kod1.txt");
//		if(plik.isFile())
//		{
//			System.out.println("plik istnieje");
//		}
//		else{
//			System.out.println("Plik nie istnieje");
//		}
//	
public static void someOp(String y) {
    System.out.println("y: " + y);
  
    y = "Ela";
  
    System.out.println("y: " + y);
  }
}

