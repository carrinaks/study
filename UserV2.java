

public class UserV2 
{
	private String password;
	
	public void SetPassword (String password)
	{
		if (password != null && password.length() != 0) this.password = password;
		 else this.password = "11111";
	
	}
	public String GetPassword ()
		{
			return this.password;
		}
		
		
	public void PasswordVerification (char[] passwd)
	{
		StringBuilder mod = new StringBuilder(); // создаём объект для преобразования массива в строку
		String stmod; //вводим промежуточную переменную для проверки пароля
		for (char i : passwd) //формируем строку из символов
		{
			mod.append(i);
		}
		stmod = mod.toString(); //преобразуем StringBuilder в строку
		
		if (stmod.equals(this.password)) //Проверяем соответствие паролей
		{ System.out.println ("Password is correct");
		}
		else
		{System.out.println ("Password is not correct");
		}
	
	}
	
}