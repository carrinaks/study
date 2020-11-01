public class Task1_5
{
	public static void main (String[] args)
	{
		int sum = 0;
		int pr = 1;
		
		for (String i:args)
		{
			sum = sum + Integer.parseInt(i);
			pr = pr * Integer.parseInt(i);
		
		}
		
		System.out.println ("Sum=" + sum);
		System.out.println ("pr=" + pr);
		
		
	}
}