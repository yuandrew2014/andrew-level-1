import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuck implements ActionListener{
	JButton joke = new JButton();
	JButton joke2 = new JButton();
public static void main(String[] args) {
	Chuck c1= new Chuck();
	c1.makeButtons();
	
}
 void makeButtons() {
	JFrame trash = new JFrame();
	JPanel p1 =  new  JPanel();
	
	trash.add(p1);
	joke2.setVisible(true);
	p1.add(joke);
	p1.add(joke2);
	
	trash.setVisible(true);
	p1.setVisible(true);
	joke.setVisible(true);
	joke.setText("joke");
	joke2.setText("punchurface");
	joke.addActionListener(this);
	joke2.addActionListener(this);
	trash.pack();
		
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if(e.getSource() == joke) {
	JOptionPane.showMessageDialog(null, "idk" );
	}
if(e.getSource() == joke2) {
JOptionPane.showMessageDialog(null, "idk" );
}
}
}
