import java.io.*;
import java.util.*;

public class Task1_4V2
{
	public static void main (String[] args)
	{
		UserV2 us = new UserV2(); // Создаём объект где хранится пароль юзера
		Scanner in = new Scanner (System.in); // Создаём объект чтения из потока
		System.out.println ("Enter password user:");
		String NewPassword = in.nextLine();//вводим пароль юзера
		us.SetPassword (NewPassword); // передаём пароль юзера переменной экземляра User
		NewPassword = null;
		
		Console cons = System.console(); // создаём объект для чтения паролей из потока
		char[] passwd=cons.readPassword("Password: "); // вводим пароль
		
		us.PasswordVerification (passwd); // проверяем корректность пароля
		
		for (int i=0; i <= passwd.length-1; i++)
		{
			passwd[i] = '0';
		System.out.println (passwd[i]);
		}
		
				
	}
}
