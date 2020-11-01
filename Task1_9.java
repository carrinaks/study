import java.util.ArrayList;
import java.util.Collections;

public class Task1_9
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
		// наибольшее и наименьшее число
		//перебираем циклом
		/*int min=0; 
		int max=0;
		for (int i:n)
		{
			if (i > max) {max = i;}
			if (i < min) {min = i;}
		
		}
		System.out.println ("min =" + min);
		System.out.println ("max =" + max);
		*/
		
		/* 
		Collections.sort (n); // Сортируем и берём первый минимальный и последний максимальный
		System.out.println ("min =" + n.get(0));
		System.out.println ("max =" + n.get(n.size()-1));
				
		*/
		// Просто пользуемся уже кем то написанным
		System.out.println (Collections.min(n));
		System.out.println (Collections.max(n));
		
	}
}
