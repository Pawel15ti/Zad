package Podstawy;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {
	
	List<Integer> lista=new ArrayList<Integer>();
	
	public void dodajE(int a){
		lista.add(a);
	}
	public void usunE(Integer o){
		lista.remove(o);
	}
	
	public void wyswietlE(){
	for(Integer i:lista){
		System.out.println(i);
	}
	}
	
	public int rozmiar(){
		return lista.size();
	}
}
