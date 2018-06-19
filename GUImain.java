import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;
	
public class GUImain extends Application {
	
	
	Random generator = new Random();
	int color1;
	int color2;
	Rectangle rect;
	Rectangle r1;
	Rectangle r2;
	Rectangle rectangle3;
	int height_width;
	int position1;
	int position2;
	int size1;
	
	Rectangle[] rectangles = new Rectangle[400];
	
	

//	public static void main(String[] args)
//	{

//	public class GUImain extends Application
		public void start(Stage primaryStage)
		{
			Rectangle rect = new Rectangle(30, 50, 50, 50);
			
			rect.setFill(Color.BLUE);
			primaryStage.setTitle("A QR Code");
			
			Rectangle r1 = new Rectangle (35, 200, 100, 100);
			r1.setStroke(Color.BLUE);
			r1.setStrokeWidth(2);
			r1.setFill(Color.BLUE);
			
			Rectangle r2 = new Rectangle (200,200,25,25);
			r2.setStroke(Color.WHITE);
			r2.setStrokeWidth(3);
			r2.setFill(Color.WHITE);
		
			for (int i = 0; i < rectangles.length; i++) 
			{
				position1 = generator.nextInt(512);
				position2 = generator.nextInt(512);
				position1 = Math.round(position1/10) * 10;
				position2 = Math.round(position2/10) * 10;
				
				rectangles[i] = new Rectangle(position1, position2, height_width, height_width);
				size1 = generator.nextInt(70);
				
				if (size1 <= 10)
					{
						height_width = 40;
					}//if
				else if (size1 <= 20)
					{
						height_width = 20;
					}
				else 
					{
						height_width = 10;
					}
		
				Rectangle rectangle3 = new Rectangle(position1, position2, height_width, height_width);
//				System.out.println(rectangle3);
				
				System.out.println("----------------_");
				System.out.println("Position 1 " + position1);
				System.out.println("Position 2 " + position2);
				System.out.println("Height & width " + height_width);
				
					rectangles[i].setFill(Color.BLACK);
					rectangles[i].setStroke(Color.BLACK);
					rectangles[i].setStrokeWidth(2);
					

			} //for
			
				//left hand top
				rectangles[394] = new Rectangle (35, 100, 100, 100);
				rectangles[394].setStroke(Color.BLACK);
				rectangles[394].setStrokeWidth(12);
				rectangles[394].setFill(Color.WHITE);
				
				//left hand top center
				rectangles[399] = new Rectangle (57, 127, 50, 50);
				rectangles[399].setStroke(Color.BLACK);
				rectangles[399].setStrokeWidth(12);
				rectangles[399].setFill(Color.BLACK);
				
				//left hand bottom
				rectangles[397] = new Rectangle (40, 400, 75, 75);
				rectangles[397].setStroke(Color.BLACK);
				rectangles[397].setStrokeWidth(12);
				rectangles[397].setFill(Color.WHITE);
				
				rectangles[395] = new Rectangle (390, 410, 100, 100);
				rectangles[395].setStroke(Color.WHITE);
				rectangles[395].setStrokeWidth(12);
				rectangles[395].setFill(Color.BLACK);	
				
				//center
				rectangles[398] = new Rectangle (412, 437, 50, 50);
//				rectangles[398].setStroke(Color.WHITE);
//				rectangles[398].setStrokeWidth(12);
				rectangles[398].setFill(Color.WHITE);	
				
				rectangles[396] = new Rectangle (350, 35, 125, 125);
				rectangles[396].setStroke(Color.BLACK);
				rectangles[396].setStrokeWidth(15);
				rectangles[396].setFill(Color.WHITE);
				
				
//			color1 = generator.nextInt(2);
//			color2 = generator.nextInt(1);
//			
			Group root = new Group(rectangles);//, r1, r2, rectangle3)
			Scene scene = new Scene(root, 512, 512, Color.WHITE);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		}//public void

		
//		Text hello = new Text(50, 50, "Hello, JavaFX!");
//		Text question = new Text (120, 80, "How's it going?");
//		
//		Group root = new Group(hello, question);
//		Scene scene = new Scene (root, 300, 120, Color.LIGHTGREEN);

public static void main(String[] args)
{
	launch(args);
}
		
		
		
		
		
	}	//class
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	