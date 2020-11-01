import java.util.ArrayList;
import java.lang.Math.*;
import java.util.Collections;

public class Task1_14 
//���������� ����� �������� � ���������� ����� �������.
{
	public static void main (String[] args)
	{
		ArrayList<Integer> n = new ArrayList<Integer>();
		System.out.println("��� �� ������ ��������� 0, ��� ��� �� �� �������� ����������� ������/The row must not contain Zerro, since it is not a natural number");
		n.addAll(ReadPotok.nInt());	 // �������� ����� ����� �����
		//**************************************************************************
		boolean nullError = true; // ��������� ���� ��� ������ ������������������
		ArrayList<Integer> StTwo = new ArrayList<Integer>(n.size()); // ������� ������
		ArrayList<Integer> StThree = new ArrayList<Integer>(n.size()); // ������� ������
		ArrayList<Integer> Number = new ArrayList<Integer>(n.size()); // ��������� �����
		for (int i:n) //���������� �������� � �������� �� ���� �������� ������
		{
			if (i == 0) 
			{
				nullError = false;
				System.out.println ("���� �� �������� ����������� ������/Zerro is not a natural number");
				break;
			}
			StTwo.add(0);
			StThree.add(0);
			Number.add(0);
		
		}
		//System.out.println ("������=" + n.size() + "�������� =" + n.toString());
		//System.out.println ("������=" +n.size() + "������ ������" + StTwo.toString());
		//System.out.println ("������=" +n.size() + "������� ������" + StThree.toString());
		//System.out.println ("������=" +n.size() + "��������� �������" + Number.toString());
		if (nullError)
		{
			for (int i=0; i < (n.size()); i++) //���������� �������� �������� ������������������
			{
						
				int j = n.get(i); // ������������� ����������, �.�. � �������� ��� ����� ��������
				
				while (Math.abs (j) != 1) //���� ������� �� ������ �� ����� 1
				{
				
					if (((j%2) != 0) && ((j%3) != 0)) // ���� ����� �� ������� �� �� 2 �� �� 3 �� ������� �� ����
					{
						Number.set(i,Math.abs(j));
						j = j/j;
						//System.out.println ("j =" + j);
					}

					
					if ((j%2)== 0) // ������� ������� ������ � �����
					{
						j = j/2;
						StTwo.set(i,(StTwo.get(i) + 1));
						//System.out.println ("������� ������=" + StTwo.get(i));
						//System.out.println ("j =" + j);
					}
					
					if (((j%3) == 0) && ((j%2) != 0)) //������� ������� ������ � �����
					{
						j = j/3;
						StThree.set(i,(StThree.get(i) + 1));
						//System.out.println ("������� ������=" + StThree.get(i));
						//System.out.println ("j =" + j);
					}
								
				}	
				
				//System.out.println ("�����=" + Number.get(i));
			 }				
		}		
		//System.out.println ("*******************************");
		//System.out.println ("������=" +n.size() + "������ ������" + StTwo.toString());
		//System.out.println ("������=" +n.size() + "������� ������" + StThree.toString());
		//System.out.println ("������=" +n.size() + "��������� �������" + Number.toString());
		
		
		
		// ************************************************************************
		double GCDrez = 1; //���
		double  SCMrez = 1; //���
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
		
		
		System.out.println ("���/GCD =" + GCDrez);
		System.out.println ("���/SCM =" + SCMrez);
		
		
	}
}
