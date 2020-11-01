import java.util.ArrayList;
import java.lang.Math;

public class CarrMath
{
	//*****************************************************************
	public static int max (int str, int[][] ar) //максимум в строке двумерного массива
	{
		int VarMax=0;
		for (int i=0; i<ar[str].length-1; i++)
			if (ar[str][i] < ar[str][i+1])
			{
				VarMax = ar[str][i+1];
			}
			System.out.println ("MAX=" + VarMax);
			return VarMax;
			
	}
	//*****************************************************************
	public static int min (int str, int[][] ar) //минимум в строке двумерного массива
	{
		int VarMin=0;
		for (int i=0; i<ar[str].length-1; i++)
			if (ar[str][i] < ar[str][i+1])
			{
				VarMin = ar[str][i];
			}
			System.out.println ("MIN=" + VarMin);
			return VarMin;
			
	}
	
	
	//*****************************************************************
	
	public static int[][] PrimeFactor (ArrayList <Integer> n) //разложение на простые множители
	{
		int [][] factor = new int [3][n.size()]; 
		boolean nullError = true; // индикатор нуля при задаче последовательности
		ArrayList<Integer> StTwo = new ArrayList<Integer>(n.size()); // степень двойки
		ArrayList<Integer> StThree = new ArrayList<Integer>(n.size()); // степень тройки
		ArrayList<Integer> Number = new ArrayList<Integer>(n.size()); // неделимое число
		for (int i:n) //заполнение массивов и проверка на ноль входящих данных
		{
			if (i == 0) 
			{
				nullError = false;
				System.out.println ("Ноль не является натуральным числом/Zerro is not a natural number");
				break;
			}
			StTwo.add(0);
			StThree.add(0);
			Number.add(0);
		}
		
		if (nullError)
		{
			for (int i=0; i < (n.size()); i++) //Перебираем элементы заданной последовательности
			{
						
				int j = n.get(i); // Промежуточная переменная, т.к. в процессе она будет меняться
				
				while (Math.abs (j) != 1) //Пока элемент по модулю не равен 1
				{
				
					if (((j%2) != 0) && ((j%3) != 0)) // Если число не делится ни на 2 ни на 3 то делится на себя
					{
						Number.set(i,Math.abs(j));
						j = j/j;
					}

					
					if ((j%2)== 0) // Считаем степени двойки в числе
					{
						j = j/2;
						StTwo.set(i,(StTwo.get(i) + 1));
					}
					
					if (((j%3) == 0) && ((j%2) != 0)) //Считаем степени тройки в числе
					{
						j = j/3;
						StThree.set(i,(StThree.get(i) + 1));
					}
								
				}	
							
			 }				
		}		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<n.size(); j++)
			{
				switch(i) 
				{
					case 0: 
					factor [i][j] = StTwo.get(j);
					break;
					case 1: 
					factor [i][j] = StThree.get(j);
					break;
					case 2: 
					factor [i][j] = Number.get(j);
					break;
				}			
				
			}
		}
		return factor;
	}
	//*****************************************************************
	public static double gcd (ArrayList<Integer> n)//НОД
	{
		int [][] factor = new int [3][n.size()];
		factor = PrimeFactor (n);
		
		double GCDrez = 1; //НОД
		
		
		for (int i=0; i < n.size()-1; i++)
		{
			if ((factor[2][i] != 0) && (factor[2][i+1] == factor[2][i]))
			{
				GCDrez = factor[2][i];
			}
			else
			{ 
				GCDrez = 1;
				break;
			}
		}
		
		 
		if (GCDrez == 1)
		{
			GCDrez = Math.pow (2,CarrMath.min (0,factor)) * Math.pow (3,CarrMath.min(1,factor));
		}
		 
		 return GCDrez;
		
	}
	//*****************************************************************
	public static double scm (ArrayList<Integer> n)//НОК
	{
		int [][] factor = new int [3][n.size()];
		factor = PrimeFactor (n);
		
		double SCMrez = 1; //НОК
				
		
			SCMrez = Math.pow (2,CarrMath.max (0,factor)) * Math.pow (3,CarrMath.max(1,factor));
		
		 
		 return SCMrez;
		
	}
	//*****************************************************************
	public static ArrayList<Integer> PrimeNumber (ArrayList<Integer> n) // Простые числа
	{
		ArrayList<Integer> PrNum = new ArrayList<Integer>();
		int[][] PrFc = new int [3][n.size()];
		PrFc = PrimeFactor(n);
		
		for (int i=0; i<n.size();i++)
		{
			
			if ((n.get (i) != 1) && (n.get(i) != 0))
			{
				
				if ((PrFc[2][i] == n.get(i)) || (n.get(i) == 2) || (n.get(i) == 3))
				{
					PrNum.add (n.get(i));
				}
			
			}
			
		}
		return PrNum;
		
	}
	
}