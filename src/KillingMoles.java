import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KillingMoles {
	int p = 0;
public static void main(String[] args) {
	KillingMoles km1 = new KillingMoles();
	km1.drawButtons(9);
}
void drawButtons(int random) {
	JFrame f1 = new JFrame();
	f1.setVisible(true);
	JPanel p1 = new JPanel();
	p1.setVisible(true);
	f1.add(p1);
		JButton[]  buttons = new JButton[24];
	for (int i = 0; i < buttons.length; i++) {
		buttons[i]=new JButton();
		p1.add(buttons[i]);
		buttons[i].setVisible(true);
	}
	f1.setSize(300, 325);
	
}
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}

}
