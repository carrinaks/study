//����� ���������� ��������� ��������, ��������

import javafx.scene.canvas.Canvas; // ������� canvas ��� ������
import javafx.scene.canvas.GraphicsContext;// ����� ��� ��������� ��������
import javafx.scene.paint.*; // �����

import java.util.ArrayList;
import java.lang.Math;


public class GraphicString { 
	private double WIDTH; //� ������?
	private double HEIGTH;//� ������?
	
	public GraphicString (double WIDTH, double HEIGTH) //� ������?
	{
		this.WIDTH = WIDTH;//� ������?
		this.HEIGTH = HEIGTH;//� ������?
		
	}
	
	   


		public static void Build (Canvas Graph,ArrayList<Double> Data)// ���������� ��������, ��� ����� ������
		{
		
		GraphicsContext gc = Graph.getGraphicsContext2D(); //
 		gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, Graph.getWidth(), Graph.getHeight());
		
		GraphicString.Grid(Graph,10,10); // �������� �����
		
		//GraphicString.LineGraph (Graph,Data,10); // ������ �������� ������
		
		
		
		
		//gc.setFill(Color.RED); // �������
		//gc.fillRect(10,10,400,10); //������������� 
		//gc.setStroke(Color.GREEN); //�������
		//gc.setLineWidth(10);//������ �����
		//gc.strokeLine(40,40,80,80); //�����
		}
	
	
	
		public static void LineGraph (Canvas Graph,ArrayList<Double> Data, double stepXp, Paint ColorLine) // ���������� ��������� �������
		// canvas �� ������� ������, ������ ������, ��� �� ��� �, ���� paint
		// 
		{
			// ����� ������ �������� ������ (�� ��� �������, ������, ��� ����������)
			GraphicsContext gc = Graph.getGraphicsContext2D(); //
			gc.setStroke(ColorLine); //�������
			
			double x=0; //������ �� ��� �
			double y=Data.get(0); // ������ �� ��� y - ������ �������� � ������� ������
			double stepX = stepXp; // ������� ���������� ���� �� ��� �
			int period = 0; // ��� � ������ �������
			
			//System.out.println ((Data.size() * stepXp));
			//System.out.println (Graph.getWidth());
			
			if ((Data.size() * stepXp-stepXp) <= Graph.getWidth()) //����������, ����� ���� ���������� �� ���� ������
				{
					while  (period <= (Data.size()-1))//
					{
						gc.strokeLine(x,Graph.getHeight()- y,stepX,Graph.getHeight()-Data.get(period));
			
						x=stepX;
						y=Data.get(period);
			
						stepX = stepX + stepXp;

						period++;
					}
				}		
		}
	
		public static void ColorPost (Canvas Graph,ArrayList<Integer> Data, double stepXp) //��������� ����������.
		{
			// canvas �� ������� ������, ������ ������, ��� �� ��� �, ���� paint
			GraphicsContext gc = Graph.getGraphicsContext2D(); //
			double x=0; //������ �� ��� �
			double y=0; //������ �� ��� y
			int period = 0; // ��� � ������ �������
			if ((Data.size() * stepXp-stepXp) <= Graph.getWidth()) //����������, ����� ���� ���������� �� ���� ������
			{
				while  (period <= (Data.size()-1))//
				{
					if (Data.get(period) == 0) { gc.setFill(Color.RED);}
					if (Data.get(period) == 1) { gc.setFill(Color.GREEN);}
					if (Data.get(period) == 2) { gc.setFill(Color.YELLOW);}
					if (Data.get(period) == 3) { gc.setFill(Color.BLUE);}
					
					gc.fillRect(x,0,x+stepXp,Graph.getHeight()); //������������� 
					x = x+stepXp;
					period++;
				}
			}
			
		}
		
		
		
		public static void Grid (Canvas Graph, double stepX, double stepY) //����� ������� (��������������� �����)
		{
			GraphicsContext gc = Graph.getGraphicsContext2D();
			
			double x=0;
			while ( x <= Graph.getWidth())
				{
					gc.strokeLine(x,0,x,Graph.getHeight()); //�����
					x = x + stepX;
				}
			
			double y=0;
			while ( y <= Graph.getHeight())
				{
					gc.strokeLine(0,y,Graph.getWidth(),y); //�����
					y = y + stepY;
				}
		
		}
	
	
	
	
}