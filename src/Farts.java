import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Farts implements ActionListener{
public static void main(String[] args) {
	Farts fart = new Farts();
	fart.toots();
}
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
 void toots() {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	
	f1.add(p1);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	f1.setVisible(true);
	p1.setVisible(true);
	b1.setVisible(true);
	b1.addActionListener(this);
	b2.setVisible(true);
	b2.addActionListener(this);
	b3.setVisible(true);
	b3.addActionListener(this);
	b1.setText("fart");
	b2.setText("rasberry");
	b3.setText("Bean fart");
	f1.pack();
}
 private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
		
	}




public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== b1) {
			playSound("fart2.wav");
	}
	if(e.getSource()== b2) {
		playSound("fart3.wav");
	}
	if(e.getSource()== b3) {
		playSound("fart4.wav");
	}
	}
}

