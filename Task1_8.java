import java.util.ArrayList;


public class Task1_8
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
			
	//чётные и не чётные числа
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> uneven = new ArrayList<Integer>();
		for (int i:n)
		{
			if ((i%2) == 0)
			{
				even.add(i);
			}
			else
			{
				uneven.add (i);
			}
		} 
		System.out.println (even.toString());
		System.out.println (uneven.toString());
	
	
	}
}
