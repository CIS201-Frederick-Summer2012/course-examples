import java.awt.*;
import javax.swing.*;
public class MyCanvas extends Canvas
{
    public MyCanvas()
    {
    
    }
   
    public void paint(Graphics graphics)
    {
        // Draw a rectangle
    	graphics.drawRect(10, 10, 100, 100);
    	
    	// Draw the same rectangle in red
    	graphics.setColor(Color.red);
        graphics.drawRect(20, 20, 120, 120);
        
        // Draw a third rectangle in red 
        // and shaded in yellow
        graphics.setColor(Color.yellow);
        graphics.fillRect(30, 30, 200, 200);
        
        graphics.setColor(Color.red);
        graphics.drawRect(80, 80, 200, 200);
        
        // Draw a circle
        graphics.setColor(Color.blue);
        graphics.fillOval(50, 50, 100, 100);
        graphics.setColor(Color.blue);
        graphics.drawOval(50, 50, 100, 100);
        graphics.drawRoundRect(10, 10, 100, 100, 5, 5);
    }
    
    public static void main(String[] args)
    {
        MyCanvas canvas = new MyCanvas();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}