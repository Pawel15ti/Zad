package Czas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//import javax.xml.crypto.Data;

public class Czas {

	public static void main(String[] args) {
	long t1 = System.currentTimeMillis();
	for(int i=0;i<1;i++)
	{
		double x=Math.pow(Math.random(), Math.random());
	}
	long t2 = System.currentTimeMillis();
	
	//System.out.println((t2-t1)/1000);
	Date dzis=new Date();
	System.out.printf("%tc",dzis);
	GregorianCalendar dziss=new GregorianCalendar();
	System.out.printf("%tc",dziss);
	System.out.println();
	System.out.println(dziss.get(Calendar.YEAR));
	GregorianCalendar urodziny=new GregorianCalendar(2016,0,27);
	if(dziss.before(urodziny)){
		System.out.println("Kup fajny prezent");
	}
	else {
		System.out.println("Zapomnia³eœ o prezencie");
	}
	}

}
