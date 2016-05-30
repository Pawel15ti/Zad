package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toloto {
	
	public static int[] Losuj(int ile,int zakres){
		
		Random losowo=new Random();
		List<Integer> pula=new ArrayList<Integer>(zakres);
		
		int[]wylosowane=new int[ile];
		
		
		for(int i=1;1<=zakres;i++)
		{
			pula.add(i);
		}
		
		for(int j=0;j<ile;j++)
		{
			int a=zakres;
			int in=losowo.nextInt(a);
			wylosowane[j]=pula.get(in);
			pula.remove(in);
			a--;
			
			
			
			
		}
		
		return wylosowane;
	}

}
