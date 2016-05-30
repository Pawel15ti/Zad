package watki;

public class OperacjeSumaPrzedzialu implements Runnable {

	private int przedzialOd;
	private int przedzialDo;
	
	private int suma;

	
	
	public OperacjeSumaPrzedzialu(int przedzialOd, int przedzialDo) {
		super();
		this.przedzialOd = przedzialOd;
		this.przedzialDo = przedzialDo;
	}

	@Override
	public void run() {
		
		suma=0;
		for(int i=przedzialOd;i<=przedzialDo;i++)
		{
			System.out.print("i");
			suma+=i;
		}
	}
	
	public int getSuma()
	{
		return suma;
	}
	
}
