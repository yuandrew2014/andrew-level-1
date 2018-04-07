import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class cardBattle implements ActionListener{
	int a1 = 100;
	int a2 = 100;
	Random ran = new Random();
	String po1 = "poke.jpg";
public static void main(String[] args) {
	cardBattle c1 = new cardBattle();
	c1.v();

	
	
}
JLabel j2 = new JLabel();
JButton b2 = new JButton();
JButton b1 = new JButton();
JLabel j1 = new JLabel();
	void v() {
		JFrame f1 = new JFrame();
		f1.setVisible(true);
		JPanel p1 = new JPanel();
		p1.setVisible(true);
		
		j1.setVisible(true);
		j1.setText(" " + a1);
		
		j2.setVisible(true);
		j2.setText(" " + a2);
		
		b1.setVisible(true);
		b1.setText("Attack");
		b1.addActionListener(this);
		
		
		b2.setVisible(true);
		b2.setText("Attack");
		b2.addActionListener(this);
		p1.setLayout(new GridLayout(3,2));
		ImageIcon i1 = new ImageIcon(this.getClass().getResource("poke.jpg"));
		
		JLabel lable = new JLabel(i1);
	     JScrollPane jsp = new JScrollPane(lable);
	      jsp.setVisible(true);
	      
	      ImageIcon i2 = new ImageIcon(this.getClass().getResource("download.png"));
	      JLabel lblae = new JLabel(i2);
		f1.add(p1);
		p1.add(j1);
		p1.add(j2);
		p1.add(b1);
		p1.add(b2);
		p1.add(jsp);
		p1.add(lblae);
		f1.pack();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int w = ran.nextInt(50) + 1;
		
		
		if (e.getSource()== b1) {
			a2 -= w;
			j1.setText( " " + a2);
		}
		if (e.getSource()== b2) {
			a1 -= w;
			j2.setText( " " + a1);
		}
		
	}
}
