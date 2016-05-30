import java.io.File;

public class Klasa {
	public static void main(String[] args){
		
		File plik=new File("C:\\Users\\Pawcio\\Desktop\\kod.txt");
		if(plik.isFile())
		{
			System.out.println("plik istnieje");
		}
		else{
			System.out.println("Plik nie istnieje");
		}
	}

}
