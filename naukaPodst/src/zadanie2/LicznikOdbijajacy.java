package zadanie2;

public class LicznikOdbijajacy extends AbstractLicznikZPrzedzialem{
	
	private int kierunek;
	
	public LicznikOdbijajacy() {
		super(0,100,20);
		stanLicznika=przedzialOd;
		kierunek=1;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public LicznikOdbijajacy(int przedzialOd, int przedzialDo, int krok) {
		super(przedzialOd, przedzialDo, krok);
		stanLicznika=przedzialOd;
		kierunek=1;
		// TODO Auto-generated constructor stub
	}
	
//	public void LicznikOdbijajacy() {
	//	super(0,9,1);
		//stanLicznika=0;
	//}
	//0 -10 kok 1 (kierunek 1) 0,1,2,3,4,5,6,7,8,9,10(kierunke=-1),9,8,7,6,5,4,3,2,1,0(kierunke=1)
	@Override
	public int nastepnaWartosc() {
		int tmp=stanLicznika+(krok*kierunek);
		int tmpp=0;
		int k=0;
		if(tmp==przedzialDo){
			kierunek=-kierunek;
		}
		if(tmp>przedzialDo){
			tmpp=tmp-(przedzialDo-przedzialOd);
		k=krok-tmpp;
	//	System.out.println("tmp "+tmp);
		//System.out.println("tmpp "+tmpp);
		tmp=przedzialDo-tmpp;
		//tmp=tmp-k;
		kierunek=-kierunek;
		//int tmpp=tmp-(przedzialDo-przedzialOd);
		//tmp=tmp-tmpp;
		}
		if(tmp==przedzialOd)
		{
			kierunek=-kierunek;
		
		//korekte dla przedzialu
		}
		if(tmp<przedzialOd)
		{	tmpp=0;
			tmpp=tmp+(przedzialDo-przedzialOd);
			k=tmp*(-1);
			//System.out.println("k "+k);
			//System.out.println("tmp "+tmp);
			//System.out.println("tmpp "+tmpp);
			tmp=przedzialOd+k;
			kierunek=-kierunek;
		
		//korekte dla przedzialu
		}
		stanLicznika=tmp;
		/*
		//int tmpp=stanLicznika-krok;
		if(tmp>przedzialDo){
			//while (tmpp<=przedzialOd) {
			//tmpp=stanLicznika-krok;
			int tmpp=stanLicznika-krok;
				stanLicznika=przedzialDo-krok;
				//int tmpp=stanLicznika-krok;
			}
			//tmpp=stanLicznika-krok;
			//stanLicznika=tmpp;
			//if(tmpp<przedzialOd){
			//tmp=stanLicznika+krok;
			//}
		//}
		else	{
			sta
			nLicznika=tmp;
		}
		*/
		return stanLicznika;
	}
	
	

}
