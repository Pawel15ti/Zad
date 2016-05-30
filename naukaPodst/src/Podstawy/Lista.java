package Podstawy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lista {
	Set zbior=new HashSet<String>();
	Set zbior2=new TreeSet<String>();
	
	public void kopiujZbior(Set zbior,Set zbior2){
	for(Object ss:zbior){
		zbior2.add(ss);
		System.out.println(ss);
	}
	}
	
	public void dodajImie(String imie){
		zbior.add(imie);
	}
	
	
	public int zliczElementy(){	
		return zbior.size();
	}
	
	public void usunElement(String name){
		zbior.remove(name);
		
	}
	
	public void wyswietlZbior(){
		for(Object s:zbior){
			System.out.println("Imie : " +s);
		}
	}

}
