import java.util.ArrayList;

public class Task1_11
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
		
		ArrayList<Integer> rez = new ArrayList<Integer>();
		for (int i:n)
		{
			if (((i%5) == 0) && ((i%11) == 0)) {	rez.add(i); }
		}
		System.out.println (rez.toString());
			
		
	}
	
}