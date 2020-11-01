import java.util.*;
public class Task1_3
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println ("Please enter the number of lines and Transition/No transition");
		int number_lines = in.nextInt();
		String TrNoTr = in.next();
		System.out.println (number_lines + "**" + TrNoTr);
		
		for (int i=1;i<=number_lines;i++)
		{
			if (TrNoTr.equals("T"))
			{
				System.out.println ("lines_"+i);
			}
			if (TrNoTr.equals("N"))
			{
				System.out.print ("lines_"+i+"/");
			}
		}
	}
}
