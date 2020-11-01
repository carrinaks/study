import java.awt.Graphics;
import java.util.Calendar;

public class Task1_7 extends java.swing.JApplet
{
	private Calendar calendar;
	
	public void init()
	{
		calendar = Calendar.getInstance(); //создание актуального календаря
		setSize(250,80);
	}
	public void paint (Graphics g)
	{
		g.drawString ("Start applet:",20,15);
		g.drawString (calendar.getTime().toString,20,35);
	}
}