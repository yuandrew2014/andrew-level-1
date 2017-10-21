import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class KillingMoles implements ActionListener{
	int a = 0;
	int ISmashMoles = 0;
public static void main(String[] args) {
	KillingMoles km1 = new KillingMoles();
Random random = new Random();
	km1.drawButtons(random.nextInt(24));
	
}
private void endGame(Date timeAtStart, int molesWhacked) {
	Date timeAtEnd = new Date();
	JOptionPane.showMessageDialog(null, "Your whack rate is "
	+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");

}
void speak1(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
JButton[]  buttons = new JButton[24];
JFrame f1 = new JFrame();

void drawButtons(int random) {
	a = random;
	f1 = new JFrame();
	f1.setVisible(true);
	JPanel p1 = new JPanel();
	p1.setVisible(true);
	f1.add(p1);
			for (int i = 0; i < buttons.length; i++) {
		buttons[i]=new JButton();
		p1.add(buttons[i]);
		buttons[i].setVisible(true);
		buttons[i].addActionListener(this);
	}
	f1.setSize(300, 325);
	buttons[random].setText("MOLE");
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if (e.getSource()== buttons[a]) {
		speak1("GET SOME BLING");
		ISmashMoles += 1;
		//f1.dispose();
		//drawButtons(new Random().nextInt(24));
	}
	else{
	 speak1 ("POUND SAND")	;
	
	//
	//drawButtons(new Random().nextInt(24));
	}
	f1.dispose();
	drawButtons(new Random().nextInt(24));
	
}


}


