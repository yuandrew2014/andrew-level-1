import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CALCULATORweFailed implements ActionListener{
	int i;
public static void main(String[] args) {
	CALCULATORweFailed c = new CALCULATORweFailed();
	c.v();
}
JTextField t1 = new JTextField();
JTextField t2 = new JTextField();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
void v() {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();

	f1.setVisible(true);
	p1.setVisible(true);
	t1.setVisible(true);
	
	t2.setVisible(true);
	b1.setVisible(true);
	b2.setVisible(true);
	b3.setVisible(true);
	b4.setVisible(true);
	f1.add(p1);
	p1.add(t1);
	p1.add(t2);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	b1.setText("+");
	b2.setText("-");
	b3.setText("*");
	b4.setText("/");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	f1.pack();
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==b1) {
		
	}
}

}
