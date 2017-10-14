import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypeToDie implements KeyListener {
	int a;
public static void main(String[] args) {
	TypeToDie t1 =  new TypeToDie();
	t1.lol();


}
 char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
 char currentLetter;
 JLabel l1 = new JLabel();
 JFrame f1 = new JFrame();
 void lol() {	
	
	currentLetter = generateRandomLetter();
	
	 f1.setVisible(true);
	 f1.setTitle("TYPE OR DIE");
	 f1.setSize(300,200);
	f1.add(l1);
	 
	 l1.setText(Character.toString(currentLetter));
	 l1.setFont(l1.getFont().deriveFont(30.0f));
	 l1.setHorizontalAlignment(JLabel.CENTER);
	 f1.addKeyListener(this);
	 l1.setVisible(true);
	 f1.pack();

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
	System.out.println(currentLetter);
	if(currentLetter == e.getKeyChar()) {
		f1.getContentPane().setBackground(Color.GREEN);
		System.out.println("correct");
		
		a++;
	}
	else {
		System.out.println("wrong");
		f1.getContentPane().setBackground(Color.RED);
	}
	currentLetter = generateRandomLetter();
	l1.setText(Character.toString(currentLetter));
	if(a % 5 == 0) {
		showTypingSpeed(a);
	}

}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();


}

