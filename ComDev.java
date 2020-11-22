import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
//***блок импорта компонентов тестовой программы
import javafx.scene.text.Text;
import javafx.scene.layout.AnchorPane;//панели компоновки
import javafx.scene.layout.BorderPane;//панели компоновки

import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.geometry.Insets;
//***
import javafx.scene.input.MouseEvent; //события мыши
import javafx.event.EventHandler;

import javafx.scene.control.Tooltip; //всплывающте подсказки


//*** блок импорта компонента исходника
import javafx.scene.canvas.Canvas; // Элемант canvas как основа
import javafx.scene.canvas.GraphicsContext;// класс для отрисовки элемента
import javafx.scene.paint.*; // цвета

import java.util.ArrayList;
import java.lang.Math;


//***

public class ComDev extends Application{ 
     
    public static void main(String[] args) {
         
        Application.launch(args);
    }
    @Override // аннотация. переопределям метод базового класса
    
	public void start(Stage stage) { // start(Stage stage): здесь собственно и определяется графический интерфейс
		
		//Панели
		//*****************************************************************
		BorderPane CenterPane = new BorderPane();
		CenterPane.setStyle("-fx-border-color: lime"); // цвет рамки
		
		
		BorderPane TopPane = new BorderPane();
		
		
		BorderPane RightPane = new BorderPane();
	
		
		BorderPane BottomPane = new BorderPane();
		//BottomPane.getChildren.add(Graph2);
		
		BorderPane LeftPane = new BorderPane();
	
		
		BorderPane rootPane = new BorderPane(CenterPane,TopPane,RightPane,BottomPane,LeftPane);
		
		//*****************************************************************
		
		//Элементы
		//*****************************************************************		
		Text text = new Text("center");
		//rootPane.getChildren().add(text);
		Text text2 = new Text("top");
		//rootPane.getChildren().add(text2);
		Text text3 = new Text("right");
		//rootPane.getChildren().add(text2);
		Text text4 = new Text("bottom");
		//rootPane.getChildren().add(text2);
		Text text5 = new Text("left");
		//rootPane.getChildren().add(text2);
		Text text6 = new Text("Cleft");
		
		
		//Новый элемент интерфейса 
			
		ArrayList<Double> Data = new ArrayList<Double>();
		for (int i = 0; i<=48; i++) //заполняем случайными данными double. показания счётчиков
		{
			double te = Math.random()*100;
			double pr = (int) (te * 100);
			//System.out.println(pr);
			te = (double)(pr / 100);
			Data.add(te);
		}
		
		ArrayList<Integer> DataIntegrity = new ArrayList<Integer>();
		for (int i = 0; i<=48; i++) //заполняем случайными данными . целостность данных
		{
			int te = (int)(Math.random()*4);
		
			//System.out.print(te);
			
			DataIntegrity.add(te);
		}
		
		System.out.println(DataIntegrity);
		System.out.println(Data);
		
		//GraphicString.Build (Graph,Data);//строим график
		Canvas Graph = new Canvas(480,220); //
		GraphicsContext gc = Graph.getGraphicsContext2D(); //
				
		GraphicString.ColorPost (Graph,DataIntegrity,10); // рисуем заливку есть/нет данных
		GraphicString.LineGraph (Graph,Data,10,Color.BLACK); // рисуем линейный график
		//GraphicString.Grid(Graph,10,10); // нарисуем сетку
		
		
		Canvas Graph2 = new Canvas(480,10); //
		
		GraphicsContext gc2 = Graph2.getGraphicsContext2D(); //
		GraphicString.ColorPost (Graph2,DataIntegrity,10);
		
		GraphicString.Grid(Graph2,480,10); // нарисуем сетку
	//------------------------------события--------------------------------------------------------------------
	/*	EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) 
		 { 
            gc.setFill(Color.GREY);
			gc.fillRect(0, Graph.getHeight()-10, Graph.getWidth(), Graph.getHeight()-10);
			gc.fillRect(0, 0, Graph.getWidth(), 10);
		 } 
		};  
		
		EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) 
		 { 
            gc.setFill(Color.LIME);
			gc.fillRect(0, Graph.getHeight()-10, Graph.getWidth(), Graph.getHeight()-10);
			gc.fillRect(0, 0, Graph.getWidth(), 10);
		 } 
		};  
		
		EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) 
		 { 
            System.out.println(e.getSceneX());
		 } 
		};  
		
		//Registering the event filter 
		Graph.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler); 
		Graph.addEventFilter(MouseEvent.MOUSE_EXITED, eventHandler1);
		Graph.addEventFilter(MouseEvent.MOUSE_MOVED, eventHandler2);
		
		*/
		//---------------------------------------------------------------------------------------------
		//++++++++++++++++++++++++++++++++++++++++++подсказки++++++++++++++++++++++++++++++++++++++++++
		
		
		Tooltip  tooltip = new Tooltip("TeSt");
       //tooltip.setPrefSize(200, 100);
       //tooltip.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
      
       // Set tooltip content
       //tooltip.setGraphic(webView);
 
       // Install tooltip for button (same as button.setTooltip)
       Tooltip.install(Graph, tooltip);
		
		//*****************************************************************
		
		CenterPane.setCenter(Graph);
		CenterPane.setBottom (Graph2);
		CenterPane.setLeft (text6);
		
		TopPane.setCenter(text2);
		RightPane.setCenter(text3);
		BottomPane.setCenter(text4);
		LeftPane.setCenter(text5);
		
		
		
		
		
		//*****************************************************************
		//Отрисовка окна
		//BorderPane rootPane = new BorderPane(CenterPane,TopPane,RightPane,BottomPane,LeftPane);
		//rootPane.setStyle("-fx-border-width: 10 10 10 10;"); // ширина рамки
		//rootPane.setStyle("-fx-border-color: lime"); // цвет рамки
		//rootPane.setStyle("-fx-background-color: red"); // цвет фона
		Scene scene = new Scene(rootPane);
		//scene.setFill(Color.BLACK);
		stage.setScene(scene);
        stage.setTitle("ComponentsDeveloping v_0.01");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.show();
		
		
		
		
    }
}