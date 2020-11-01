import java.io.*;
import java.util.*;

public class Task1_4
{
	public static void main (String[] args)
	{
		User us = new User(); // Создаём объект где хранится пароль юзера
		Scanner in = new Scanner (System.in); // Создаём объект чтения из потока
		System.out.println ("Enter password user:");
		String NewPassword = in.nextLine();//вводим пароль юзера
		us.SetPassword (NewPassword); // передаём пароль юзера переменной экземляра User
		NewPassword = null;
		Console cons = System.console(); // создаём объект для чтения паролей из потока
		char[] passwd=cons.readPassword("Password: "); // вводим пароль
		StringBuilder mod = new StringBuilder(); // создаём объект для преобразования массива в строку
		String stmod; //вводим промежуточную переменную для проверки пароля
		for (char i : passwd) //формируем строку из символов
		{
			mod.append(i);
		}
		stmod = mod.toString(); //преобразуем StringBuilder в строку
		if (stmod.equals(us.GetPassword())) //Проверяем соответствие паролей
		{ System.out.println ("Password is correct");
		}
		else
		{System.out.println ("Password is not correct");
		}
		
		NewPassword = ""; //string
		passwd = {0}; //[] char
		mod = "0"; //StringBuildeer
		stmod = "0"; // String
		
		
	}
}
