import java.util.ArrayList;
import java.lang.Math.*;

public class Task1_12 //сортировка пузырьком по увеличению модуля числа
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
		
		for (int j=2; j<=n.size(); j++)
		{
			
			for (int i=0; i<=(n.size() - j);i++)
			{
				int t =n.get(i);
				
				
				if (Math.abs(n.get(i)) > Math.abs(n.get(i+1)))
				{
					
					n.set(i,n.get(i+1));
					n.set(i+1,t);
				
				}
				
			}
		}
		
		System.out.println ("n=" + n.toString());
		
	}
}
