//класс построени€ строковых диаграмм, графиков

import javafx.scene.canvas.Canvas; // Ёлемант canvas как основа
import javafx.scene.canvas.GraphicsContext;// класс дл€ отрисовки элемента
import javafx.scene.paint.*; // цвета

import java.util.ArrayList;
import java.lang.Math;


public class GraphicString { 
	private double WIDTH; //а нахера?
	private double HEIGTH;//а нахера?
	
	public GraphicString (double WIDTH, double HEIGTH) //а нахера?
	{
		this.WIDTH = WIDTH;//а нахера?
		this.HEIGTH = HEIGTH;//а нахера?
		
	}
	
	   


		public static void Build (Canvas Graph,ArrayList<Double> Data)// построение графиков, тут будет логика
		{
		
		GraphicsContext gc = Graph.getGraphicsContext2D(); //
 		gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, Graph.getWidth(), Graph.getHeight());
		
		GraphicString.Grid(Graph,10,10); // нарисуем сетку
		
		//GraphicString.LineGraph (Graph,Data,10); // рисуем линейный график
		
		
		
		
		//gc.setFill(Color.RED); // заливка
		//gc.fillRect(10,10,400,10); //пр€моугольник 
		//gc.setStroke(Color.GREEN); //заливка
		//gc.setLineWidth(10);//ширина линии
		//gc.strokeLine(40,40,80,80); //лини€
		}
	
	
	
		public static void LineGraph (Canvas Graph,ArrayList<Double> Data, double stepXp, Paint ColorLine) // построение линейного графика
		// canvas на котором рисуем, массив данных, шаг по оси х, цвет paint
		// 
		{
			// метод строит линейный график (на чем строить, данные, шаг построения)
			GraphicsContext gc = Graph.getGraphicsContext2D(); //
			gc.setStroke(ColorLine); //заливка
			
			double x=0; //начало по оси х
			double y=Data.get(0); // начало по оси y - первое значение в массиве данных
			double stepX = stepXp; // значени начального шага по оси х
			int period = 0; // шаг в данных массива
			
			//System.out.println ((Data.size() * stepXp));
			//System.out.println (Graph.getWidth());
			
			if ((Data.size() * stepXp-stepXp) <= Graph.getWidth()) //определяем, чтобы зона построения не была больше
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
	
		public static void ColorPost (Canvas Graph,ArrayList<Integer> Data, double stepXp) //диаграмма столбчатая.
		{
			// canvas на котором рисуем, массив данных, шаг по оси х, цвет paint
			GraphicsContext gc = Graph.getGraphicsContext2D(); //
			double x=0; //начало по оси х
			double y=0; //начало по оси y
			int period = 0; // шаг в данных массива
			if ((Data.size() * stepXp-stepXp) <= Graph.getWidth()) //определяем, чтобы зона построения не была больше
			{
				while  (period <= (Data.size()-1))//
				{
					if (Data.get(period) == 0) { gc.setFill(Color.RED);}
					if (Data.get(period) == 1) { gc.setFill(Color.GREEN);}
					if (Data.get(period) == 2) { gc.setFill(Color.YELLOW);}
					if (Data.get(period) == 3) { gc.setFill(Color.BLUE);}
					
					gc.fillRect(x,0,x+stepXp,Graph.getHeight()); //пр€моугольник 
					x = x+stepXp;
					period++;
				}
			}
			
		}
		
		
		
		public static void Grid (Canvas Graph, double stepX, double stepY) //сетка графика (вспомогательный метод)
		{
			GraphicsContext gc = Graph.getGraphicsContext2D();
			
			double x=0;
			while ( x <= Graph.getWidth())
				{
					gc.strokeLine(x,0,x,Graph.getHeight()); //лини€
					x = x + stepX;
				}
			
			double y=0;
			while ( y <= Graph.getHeight())
				{
					gc.strokeLine(0,y,Graph.getWidth(),y); //лини€
					y = y + stepY;
				}
		
		}
	
	
	
	
}