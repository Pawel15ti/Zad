package Podstawy;

import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class Mapy {
Map<Integer,String> mapa=new HashMap<Integer,String>();

public void dodaj(int i,String imie){
	String pokuj=mapa.put(i, imie);
	if(pokuj!=null)
	{
		System.out.println("Pokoj byl zajety");
	}
}
public void wyswietl(int key){
	//return ""+mapa.get(key)+"imie";
	boolean t=mapa.containsKey(key);
	if(t==true){
		System.out.println("W bazie jest dany klucz");
		String k=mapa.get(key);
		System.out.println(k);
	//	return k;
	}else{
		System.out.println("W bazie nie ma danego klucza");
	}
	//return ""+"imie";
}
public void usuwanie(int key){
	//return ""+mapa.get(key)+"imie";
	boolean t=mapa.containsKey(key);
	if(t==true){
		System.out.println("W bazie jest dany klucz");
		String k=mapa.remove(key);
		System.out.println(k+" usunieto");
	//	return k;
	}else{
		System.out.println("W bazie nie ma danego klucza");
	}
	//return ""+"imie";
}
}
