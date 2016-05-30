package Podstawy;

import java.util.PriorityQueue;
import java.util.Queue;

public class Kolejki {
	Queue<String> kolejka=new PriorityQueue<String>();
	
	public void dodajE(String imie){
		kolejka.offer(imie);
	}
	
	public void WypiszK(){
		for(Object o:kolejka){
			System.out.println(o+" "+kolejka.peek());
		}
	}
	public void usunK(){
		for(Object o:kolejka){
			System.out.println(o+" "+kolejka.poll());
		}
	}
}
