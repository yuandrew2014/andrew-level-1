import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypeToDie {
public static void main(String[] args) {
	TypeToDie t1 =  new TypeToDie();
	t1.lol();


}
 char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}

 void lol() {	
	
	char currentLetter = generateRandomLetter();
	 JFrame f1 = new JFrame();
	 f1.setVisible(true);
	 f1.setTitle("TYPE OR DIE");
	 f1.setSize(300,200);
	 JLabel l1 = new JLabel();
	 l1.setVisible(true);
	 l1.setText(Character.toString(currentLetter));
	 l1.setFont(l1.getFont().deriveFont(5438.0f));
	 l1.setHorizontalAlignment(JLabel.CENTER);

	 
}
}
