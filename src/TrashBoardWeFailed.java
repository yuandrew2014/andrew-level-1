import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrashBoardWeFailed implements KeyListener {
	static int speak = 0;
public static void main(String[] args) {
	TrashBoardWeFailed board = new TrashBoardWeFailed();
	board.GUI();
}
public void GUI() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 5000);
	frame.addKeyListener(this);
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words);
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
		
	

}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak(Character.toString(e.getKeyChar()));
	System.out.println(e.getKeyChar());
	speak("trash cans for life chinese");
	speak++;
	}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
