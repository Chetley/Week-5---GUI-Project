import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;

import java.util.Random;
	
public class GUImain extends Application {
	
	
	Random generator = new Random();
	int color1;
//	int color2;
	Rectangle rect;
	Rectangle r1;
	Rectangle r2;
	Rectangle rectangle3;
	int height_width;
	int position1;
	int position2;
	int size1;


	
	Rectangle[] rectangles = new Rectangle[500];
	
	

//	public static void main(String[] args)
//	{

//	public class GUImain extends Application
		public void start(Stage primaryStage)
		{
			Rectangle rect = new Rectangle(30, 50, 50, 50);
			
			rect.setFill(Color.BLACK);
			primaryStage.setTitle("A QR Code");
			
			Rectangle r1 = new Rectangle (35, 200, 100, 100);
			r1.setStroke(Color.BLACK);
			r1.setStrokeWidth(2);
			r1.setFill(Color.BLACK);
			
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
				
				//create a random generator to create sizes for rectangles
				size1 = generator.nextInt(70);
				if (size1 <= 20)
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
				
				//create random generator to assign color
				color1 = generator.nextInt(1);
				if (color1 == 0)
				{	
					rectangles[i].setFill(Color.BLACK);
					rectangles[i].setStroke(Color.BLACK);
					rectangles[i].setStrokeWidth(2);
					
				}
				else
				{
					rectangles[i].setFill(Color.WHITE);
					rectangles[i].setStroke(Color.WHITE);
					rectangles[i].setStrokeWidth(3);
				}
//					rectangles[i].setFill(Color.BLACK);
//					rectangles[i].setStroke(Color.BLACK);
//					rectangles[i].setStrokeWidth(2);
//					

			} //for
			
				//left hand top
//				rectangles[394] = new Rectangle (33, 100, 100, 100);
				rectangles[496] = new Rectangle (30, 50, 130, 130);
				rectangles[496].setStroke(Color.WHITE);
				rectangles[496].setStrokeWidth(7);
				rectangles[496].setFill(Color.BLACK);
				
				//left hand top center
				rectangles[499] = new Rectangle (52, 74, 80, 80);
				rectangles[499].setStroke(Color.WHITE);
				rectangles[499].setStrokeWidth(10);
				rectangles[499].setFill(Color.BLACK);
				
				//left hand top
				rectangles[494] = new Rectangle (372, 74, 80, 80);
				rectangles[494].setStroke(Color.WHITE);
				rectangles[494].setStrokeWidth(10);
				rectangles[494].setFill(Color.BLACK);
				
				//left hand top background
				rectangles[493] = new Rectangle (350, 50, 130, 130);
				rectangles[493].setStroke(Color.WHITE);
				rectangles[493].setStrokeWidth(7);
				rectangles[493].setFill(Color.BLACK);
				
				//left hand bottom
				rectangles[492] = new Rectangle (30, 390, 130, 130);
				rectangles[492].setStroke(Color.WHITE);
				rectangles[492].setStrokeWidth(10);
				rectangles[492].setFill(Color.BLACK);
				
				//left hand bottom center
				rectangles[498] = new Rectangle (52, 414, 80, 80);
				rectangles[498].setStroke(Color.WHITE);
				rectangles[498].setStrokeWidth(10);
				rectangles[498].setFill(Color.BLACK);
				
				//right hand bottom background
				rectangles[495] = new Rectangle (340, 370, 100, 100);
				rectangles[495].setStroke(Color.WHITE);
				rectangles[495].setStrokeWidth(10);
				rectangles[495].setFill(Color.BLACK);
				
				rectangles[497] = new Rectangle (369, 401, 40, 40);
				rectangles[497].setStroke(Color.WHITE);
				rectangles[497].setStrokeWidth(15);
				rectangles[497].setFill(Color.BLACK);	
				
				//center
//				rectangles[398] = new Rectangle (412, 437, 50, 50);
//				rectangles[398].setStroke(Color.WHITE);
//				rectangles[398].setStrokeWidth(12);
//				rectangles[398].setFill(Color.WHITE);	
				
				
//			color1 = generator.nextInt(2);
//			color2 = generator.nextInt(1);
//			
			Group root = new Group(rectangles);//, r1, r2, rectangle3)
			Scene scene = new Scene(root, 512, 512, Color.WHITE);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}//public void

	

public static void main(String[] args)
{
	launch(args);
}
		
		
		
		
		
	}	//class
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	