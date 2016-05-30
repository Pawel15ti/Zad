package watki;

public class TestSumaLiczb {

	private static final int PRZEDZIAL_MIN=0;
	private static final int PRZEDZIAL_MAX=999999;
	
	public static void main(String[] args) throws InterruptedException
	{
		long startCzas=System.currentTimeMillis();
		int suma=0;
		
		for(int i=PRZEDZIAL_MIN;i<=PRZEDZIAL_MAX;i++)
		{
			System.out.print("i");
			suma+=i;
		}
		
		long endCzas=System.currentTimeMillis();
		System.out.println();
		long czasBezWatku=(endCzas-startCzas);
		
		
		OperacjeSumaPrzedzialu operacja1=new OperacjeSumaPrzedzialu(0,200000);
		OperacjeSumaPrzedzialu operacja2=new OperacjeSumaPrzedzialu(200001,400000);
		OperacjeSumaPrzedzialu operacja3=new OperacjeSumaPrzedzialu(400001,600000);
		OperacjeSumaPrzedzialu operacja4=new OperacjeSumaPrzedzialu(600001,800000);
		OperacjeSumaPrzedzialu operacja5=new OperacjeSumaPrzedzialu(800001,999999);
		
		Thread t1=new Thread(operacja1);
		Thread t2=new Thread(operacja2);
		Thread t3=new Thread(operacja3);
		Thread t4=new Thread(operacja4);
		Thread t5=new Thread(operacja5);
		
		startCzas=System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();//czeka na zakonczenie watku
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		suma=operacja1.getSuma()+operacja2.getSuma()+operacja3.getSuma()+operacja4.getSuma()+operacja5.getSuma();
		
		endCzas=System.currentTimeMillis();
		long czasZWatkiem=(endCzas-startCzas);
		System.out.println("suma="+suma);
		System.out.println("Czasm operacji ="+czasBezWatku);
		System.out.println("Czasm operacji ="+czasZWatkiem);
	}
}
