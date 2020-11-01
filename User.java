public class User 
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
}