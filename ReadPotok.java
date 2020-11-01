import java.util.*; 




public class ReadPotok 
{
	// Метод проверяет является ли символ целым числом
	public static boolean isDigit(String s) throws NumberFormatException 
	{
    try 
	{
        Integer.parseInt(s);
        return true;
    } 
	catch (NumberFormatException e) 
	{
        return false;
    }
	}
	
	public static ArrayList<Integer> nInt ()// Метод преобразует вводимые символы в массив целых чисел
	
	{
		ArrayList<Integer> n = new ArrayList<Integer>(); // массив целых элементов
		Scanner in = new Scanner(System.in); //Чтение из потока
		
		System.out.println ("Please, enter a series of integers:");
		System.out.println ("After finishing, click not integer");
		
		String potok = in.nextLine(); // читаем строку
			
		while(ReadPotok.isDigit(potok)) // проверяет целое ли число, если да
		{
			n.add (Integer.parseInt(potok)); // заносим в архив
			potok = in.nextLine(); //читаем следующую строку
				
		}
		
		return n;
		
	}//*




}