import java.util.*;

public class Task1_6
{
	public static void main (String[] args)
	{
		
		Calendar calendar1 = new GregorianCalendar (2020,7,14,22,23,24);
		//calendar1.set(calendar1.HOUR_OF_DAY,14);
		//calendar1.set(calendar1.MINUTE,32);
		//calendar1.set(calendar1.SECOND,22);
		
		
		Calendar calendar2 = new GregorianCalendar ();
		
		System.out.println ("Surname: Kirsenko");
		System.out.println ("Start date:" + calendar1.getTime());
		System.out.println ("Expire date:" + calendar2.getTime());
		
	}
}
