package TypWyliczeniowy;

import java.util.Scanner;

public class Enumm1 {
public enum typWyliczeniowy
{
	PONIEDZIALEK(1,"pon"),WTOREK(2,"wt"),SRODA(3,"sr"),CZWARTEK(4,"czw"),PIATEK(5,"pt"),SOBOTA(6,"sob"),NIEDZIELA(7,"nie");

	private int dzien;
	private String skrot;
	private typWyliczeniowy(int l,String s) {
		this.dzien=l;
		this.skrot=s;
	}
	public String toString(){
		return "Dzien : "+dzien+ " skrot : "+ skrot+" - " + super.toString();
	}
}
	
	
	
	
	public static void main(String[] args) {
		typWyliczeniowy e=typWyliczeniowy.NIEDZIELA;
		//e.dzien
System.out.println(e);
Scanner sc = new Scanner(System.in);

	}

}
