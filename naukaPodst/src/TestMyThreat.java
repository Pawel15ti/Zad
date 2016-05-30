import Podstawy.MyThread;

public class TestMyThreat {

	public static void main(String[] args) {
		Runnable my=new MyThread();
		Thread wyj=new Thread(my);
		Thread wyj5=new Thread(my);
		Thread wyj6=new Thread(my);
		
		Thread wyj2=new Thread(new MyThread());
		Thread wyj3=new Thread(new MyThread());
		Thread wyj4=new Thread(new MyThread());
	
		//for(int i=0;i<100;i++){
		
		//wyj2.start();
		wyj.start();
		wyj5.start();
		wyj6.start();

		
		//}
	}

}
