import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements ActionListener{
	
public static void main(String[] args) {
	Binary ha = new Binary();
	ha.ButtonFace();
}
String one;

JPanel p1 = new JPanel();
JButton b1 = new JButton();
JTextField t2 = new JTextField(20);
JTextField t1 = new JTextField(20);
void ButtonFace() {
	JFrame f1 = new JFrame();
	
	
	p1.setVisible(true);
	f1.setVisible(true);
	b1.setVisible(true);
	f1.add(p1);
	
	p1.add(t2);
	p1.add(b1);
		
	p1.add(t1);
	b1.setText("convert");
f1.setTitle("Give me garbage or give me trash");
	f1.pack();
	b1.addActionListener(this);
	
}
String convert(String binary) {
	 int asciiValue = Integer.parseInt(binary, 2);
	 char theLetter = (char) asciiValue;
	 return "" + theLetter;
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String one = t2.getText();
	System.out.println(one.length());
	t1.setText(convert(one));
	
}


}
