package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int [] tablica;
		tablica=Lotto.Losuj(5, 45);
		Arrays.sort(tablica);
		System.out.println(tablica);
		for(int t:tablica)
		{
		System.out.println(t);
		}

	}

}
