package kurs;

public class Przeciazanie {
	private static int numerID;
	private static int nextId;
	private double promien;
	
	public Przeciazanie() {
		this(1.0);
	}
	public Przeciazanie(double r){
		this(r,"null");
	}
	public Przeciazanie(double r,String s){
		this.promien=r;
		if(s.equals("km")){
			promien/=1000;}
			if(s.equals("cm")){
				promien*=100;
			}
			if(s.equals("mm")){
				promien*=1000;
			}
	}
	public int getId(){
	
		numerID=nextId;
		nextId++;
		return numerID;
			}
	public void setPromien(double r){
		this.promien=r;
	}
	public void setPromien(double r,String miara){
		this.promien=r;
		if(miara.equals("km")){
			promien/=1000;}
			if(miara.equals("cm")){
				promien*=100;
			}
			if(miara.equals("mm")){
				promien*=1000;
			}
		}
	
	public double getPromien(){
	//	System.out.println(promien);
		return promien;
	}
	@Override
	public String toString() {
		return "Przeciazanie [promien=" + promien +" obliczPole "+obliczPole()+" obliczObwod "+obliczObwod()+"]";
	}
	
	public double obliczPole(){
		double pole;
		pole=Math.PI*Math.pow(promien, 2);
		return pole;
		
	}
	
	public double obliczObwod(){
		double obwod;
		obwod=2*Math.PI*promien;
		
		return obwod;
	}
	

	
static{
	nextId=1;
}
}
