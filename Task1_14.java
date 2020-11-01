import java.util.ArrayList;
import java.lang.Math.*;
import java.util.Collections;

public class Task1_14 
//Наибольший общий делитель и наименьшее общее кратное.
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		System.out.println("Ряд не должен содержать 0, так как он не является натуральным числом/The row must not contain Zerro, since it is not a natural number");
		n.addAll(ReadPotok.nInt());	 // получаем поток целых чисел
		//**************************************************************************
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
		//System.out.println ("размер=" + n.size() + "Исходный =" + n.toString());
		//System.out.println ("размер=" +n.size() + "Степни двойки" + StTwo.toString());
		//System.out.println ("размер=" +n.size() + "Степени тройки" + StThree.toString());
		//System.out.println ("размер=" +n.size() + "Неделимый остаток" + Number.toString());
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
						//System.out.println ("j =" + j);
					}

					
					if ((j%2)== 0) // Считаем степени двойки в числе
					{
						j = j/2;
						StTwo.set(i,(StTwo.get(i) + 1));
						//System.out.println ("Степень двойки=" + StTwo.get(i));
						//System.out.println ("j =" + j);
					}
					
					if (((j%3) == 0) && ((j%2) != 0)) //Считаем степени тройки в числе
					{
						j = j/3;
						StThree.set(i,(StThree.get(i) + 1));
						//System.out.println ("Степень тройки=" + StThree.get(i));
						//System.out.println ("j =" + j);
					}
								
				}	
				
				//System.out.println ("число=" + Number.get(i));
			 }				
		}		
		//System.out.println ("*******************************");
		//System.out.println ("размер=" +n.size() + "Степни двойки" + StTwo.toString());
		//System.out.println ("размер=" +n.size() + "Степени тройки" + StThree.toString());
		//System.out.println ("размер=" +n.size() + "Неделимый остаток" + Number.toString());
		
		
		
		// ************************************************************************
		double GCDrez = 1; //НОД
		double  SCMrez = 1; //НОК
		for (int i=0; i < Number.size()-1; i++)
		{
			if ((Number.get(i) != 0) && (Number.get(i+1) == Number.get(i)))
			{
				GCDrez = Number.get(i);
			}
			else
			{ 
				GCDrez = 1;
				break;
			}
		}
		
		if (GCDrez == 1)
		{
			GCDrez = Math.pow (2,Collections.min(StTwo)) * Math.pow (3,Collections.min(StThree));
		}
		
		
		SCMrez = Math.pow (2, Collections.max(StTwo)) * Math.pow (3, Collections.max(StThree));
		
		
		System.out.println ("НоД/GCD =" + GCDrez);
		System.out.println ("НоК/SCM =" + SCMrez);
		
		
	}
}
