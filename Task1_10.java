import java.util.ArrayList;

public class Task1_10
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(ReadPotok.nInt());
		System.out.println ("n=" + n.toString());
		
		ArrayList<Integer> rez = new ArrayList<Integer>();
		for (int i:n)
		{
			if (((i%3) == 0) || ((i%9) == 0)) {	rez.add(i); }
		}
		System.out.println (rez.toString());
			
		
	}
	
}