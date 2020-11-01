import java.util.ArrayList;



public class test
{
	public static void main (String args[])
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		
		n.add(24);
		n.add(36);
		n.add(48);
		int [][] factor = new int [3][n.size()];
		System.out.println(n.toString());
		
		factor = CarrMath.PrimeFactor(n);
		
		
		
		for (int i=0;i<3;i++)
		{
			System.out.println("----");
			for (int j=0;j<n.size(); j++)
			{
				System.out.print ("|"+factor[i][j]+"|");
				
			}
			System.out.println("");
		}
		
		int MAX,MIN;
		
		MAX = CarrMath.max (0,factor);
		MIN = CarrMath.min (0,factor);
		
		System.out.println ("мнд=" + CarrMath.gcd (n));
		System.out.println ("мнй=" + CarrMath.scm (n));
		
		
	}
}
