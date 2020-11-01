import java.util.ArrayList;
import java.lang.Math.*;

public class Task1_13 
/* Вывести все трёхзначные числа в десятичной записи которых нет
одинаковых цифр
*/
{
	public static boolean povT (int i)
	{
		ArrayList<Integer> razr = new ArrayList<Integer>();
		        razr.add(i/100);
				razr.add((i-(razr.get(0)*100))/10);
				razr.add(i-razr.get(0)*100 - razr.get(1)*10);
				//System.out.println ("razr 0 =" + razr.get(0).toString());
				//System.out.println ("razr 1 =" + razr.get(1).toString());
				//System.out.println ("razr 2 =" + razr.get(2).toString());
				
				
				if ((razr.get(0) == razr.get(1)) || (razr.get(0) == razr.get(2)) || (razr.get(1)==razr.get(2)))
				{
					//System.out.println ("false");
					//System.out.println ("***************");
					return false;
					
				}	
				else 
				{
					//System.out.println ("true");
					//System.out.println ("***************");
					return true;
				}
	
	}
	
	
	
	
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
	
		ArrayList<Integer> rez = new ArrayList<Integer>();
		
		for (int i:n)
		{
			if (Math.abs(i) < 1000 && Math.abs(i) > 99) //определяем что число трёхзначное
			{
				
				if (povT(i))
				{
					rez.add(i);
				}
				
				
			}
			
			
		}
		System.out.println ("rez=" + rez.toString());
	
	
	}
}
