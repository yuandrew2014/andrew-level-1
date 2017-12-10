import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame j1 = new JFrame();
j1.add(panel);
		// 2. Add the panel to the frame
		
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 

// 5. Add the turtle to the panel 
for (int i = 0; i < 50; i++) {
	Turtle t1 = new Turtle();
int var = new Random().nextInt(50);
int var2 = new Random().nextInt(100);
		panel.addTurtle(t1);
		t1.setX( var );
		t1.setY( var2 );
		// 6. Put 50 Turtles on the beach
}
j1.setVisible(true);
j1.pack();
	}
}
