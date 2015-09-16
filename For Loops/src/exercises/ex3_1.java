package exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ex3_1 extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent()
    {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

   
        /*We want to draw 20 vertical lines with a distance of 8. The first line has to be at x = 10. So the xvalues
        of the lines will be 10, 18, 26, 34, and so forth.
        These x-values fit in with the formula 10 + i * 8, where i is the index variable: i = 0, 1, 2, �, 19.
        A way to make the drawing is to use a for-statement:*/
    	
//
//    	private void drawShapes(GraphicsContext gc)
//    	{
//    		 int y1 = 30; // start point: (x,y1)
//    		 int y2 = 60; // end point: (x,y2)
//    		 	for (int i = 0; i < 20; i++) {
//    		 		int x = 10 + i * 8;
//    		 		gc.strokeLine(x, y1, x, y2);
//    		 	}
//    	}
    
   /* create an application that draws 10 vertical lines
    * the first line's height is 80
    * the height of the next lines is decreased by 8
    * the lower endpoint of the lines are at (16, 160), (32,148), (48,136)
    */
    
//    private void drawShapes(GraphicsContext gc){
//    	int y1 = 80;
//    	int y2 = 160;
//    	int x = 16;
//    	
//    	for (int i = 0; i < 10; i++){
//    		gc.strokeLine(x, y1, x, y2);
//    		x += 16;
//    		y1 -= 4;
//    		y2 -= 12;
//    	}
//    	
//    }
    
    private void drawShapes(GraphicsContext gc){
    	
    	double x = 180;
    	double y1 = 190;
    	double y2 = y1-126;
    	
    	while (x >= 5){
    		gc.strokeLine(20, y1, x, y2);
    		x = x * 0.75;
//    		y1 = y1 + 0.1 * x;
//    		y2 = y2 - 0.05 * x;
    	}
    	
    }
    
    

    	
}


