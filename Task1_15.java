import java.util.ArrayList;
import java.lang.Math.*;
import java.util.Collections;

public class Task1_15 
//Простые числа
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		n.addAll(ReadPotok.nInt());	 // получаем поток целых чисел
		//**************************************************************************
		System.out.println(CarrMath.PrimeNumber(n).toString());
	}
}