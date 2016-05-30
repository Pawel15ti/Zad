package Array;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	
	public static int[] Losuj(int ile,int zakres){
		
		Random losowe=new Random();
		ArrayList<Integer> pula =new ArrayList<Integer>(zakres);
		int[] wylosowane=new int[ile];
		for(int i=1;i<=zakres;i++){
			pula.add(i);
		}
		int n=zakres;
		for (int j=0;j<ile;j++){
			
			
			int index=losowe.nextInt(n);
			wylosowane[j]=pula.get(index);
			pula.remove(index);
			n--;
			
			
			
		}
		
		
		return wylosowane;
	}

}
